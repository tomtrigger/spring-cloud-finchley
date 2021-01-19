package com.huang.microserviceprovideruser;

import com.huang.microserviceprovideruser.dao.UserDao;
import com.huang.microserviceprovideruser.entity.User;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.stream.Stream;

@SpringBootApplication
@EnableEurekaClient
public class ProviderUserApplication {

    @Resource
    private UserDao userDao;

    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication.class, args);
    }

    @Bean
    ApplicationRunner runner() {
        return args -> {
            User user1 = new User(1L, "张三", "zs", 25, new BigDecimal(200));
            User user2 = new User(2L, "李四", "ls", 25, new BigDecimal(200));
            User user3 = new User(3L, "王五", "ww", 25, new BigDecimal(200));

            Stream.of(user1, user2, user3).forEach(userDao::save);
        };
    }

}
