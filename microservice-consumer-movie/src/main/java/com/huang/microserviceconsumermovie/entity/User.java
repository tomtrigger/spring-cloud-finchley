package com.huang.microserviceconsumermovie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author huangxiunian
 * @date 2021/1/18 22:55
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String id;

    private String name;

    private String username;

    private Integer age;

    private BigDecimal balance;
}
