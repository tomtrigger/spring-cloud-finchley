package com.huang.cloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 该类为Ribbon的配置类
 * 注意：该类不能放在主应用程序上下文@ComponentScan所扫描的包中，否则配置将会被所有Ribbon Client共享
 * @author huangxiunian
 * @date 2021/1/24 22:35
 */

@Configuration
public class RibbonConfiguration {

    @Bean
    public IRule ribbonRule() {
        // 负载均衡配置，改为随机
        return new RandomRule();
    }

}
