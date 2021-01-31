package com.huang.microserviceconsumermovie.feign;

import com.huang.microserviceconsumermovie.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author huangxiunian
 * @date 2021/1/31 11:32
 */

@FeignClient(name = "microservice-provider-user")
public interface UserFeignClient {

    @GetMapping("/users/{id}")
    User findById(@PathVariable("id") Long id);

}
