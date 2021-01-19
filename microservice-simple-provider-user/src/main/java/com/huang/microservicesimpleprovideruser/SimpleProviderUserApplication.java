package com.huang.microservicesimpleprovideruser;

import com.huang.microservicesimpleprovideruser.dao.UserRepository;
import com.huang.microservicesimpleprovideruser.entity.User;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.stream.Stream;

@SpringBootApplication
public class SimpleProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleProviderUserApplication.class, args);
    }

    @Bean
    ApplicationRunner init(UserRepository userRepository) {
        return args -> {
            User user1 = new User(1L, "account1", "张三", 20, new BigDecimal(100));
            User user2 = new User(2L, "account2", "李四", 21, new BigDecimal(200));
            User user3 = new User(3L, "account3", "王五", 22, new BigDecimal(300));
            Stream.of(user1, user2, user3).forEach(userRepository::save);
        };
    }

}
