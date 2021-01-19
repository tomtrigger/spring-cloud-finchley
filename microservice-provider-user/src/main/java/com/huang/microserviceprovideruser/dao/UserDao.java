package com.huang.microserviceprovideruser.dao;

import com.huang.microserviceprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author huangxiunian
 * @date 2021/1/18 22:58
 */
public interface UserDao extends JpaRepository<User, Long> {
}
