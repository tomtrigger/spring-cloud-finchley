package com.huang.microservicesimpleconsumermovid.ctrl;

import com.huang.microservicesimpleconsumermovid.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author huangxiunian
 * @date 2021/1/17 23:43
 */

@RestController
@RequestMapping("/movies")
public class MovidController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id) {
        User user = restTemplate.getForObject("http://localhost:8080/users/1", User.class, id);
        return user;
    }

}
