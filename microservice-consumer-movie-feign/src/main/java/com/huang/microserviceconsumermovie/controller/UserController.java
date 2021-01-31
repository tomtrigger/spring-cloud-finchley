package com.huang.microserviceconsumermovie.controller;

import com.huang.microserviceconsumermovie.entity.User;
import com.huang.microserviceconsumermovie.feign.UserFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author huangxiunian
 * @date 2021/1/18 23:15
 */

@RestController
@RequestMapping("/movie/users")
public class UserController {

    @Resource
    private UserFeignClient userFeignClient;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        return userFeignClient.findById(id);
    }

}
