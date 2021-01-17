package com.huang.microservicesimpleprovideruser.dao;

import com.huang.microservicesimpleprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author huangxiunian
 * @date 2021/1/17 22:38
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
