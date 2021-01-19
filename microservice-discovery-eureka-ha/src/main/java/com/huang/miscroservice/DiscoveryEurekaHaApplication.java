package com.huang.miscroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author huangxiunian
 * @date 2021/1/19 21:40
 */

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryEurekaHaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryEurekaHaApplication.class, args);
    }

}
