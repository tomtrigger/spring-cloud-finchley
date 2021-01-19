package com.huang.microserviceprovideruser.ctrl;

import com.huang.microserviceprovideruser.dao.UserDao;
import com.huang.microserviceprovideruser.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author huangxiunian
 * @date 2021/1/18 22:57
 */

@RestController
@RequestMapping("/users")
public class UserController {

    @Resource
    private UserDao userDao;

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id) {
        return userDao.findById(id);
    }

}
