package com.huang.microservicesimpleconsumermovid.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author huangxiunian
 * @date 2021/1/17 23:39
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;

    private String name;

    private String username;

    private Integer age;

    private BigDecimal balance;

}
