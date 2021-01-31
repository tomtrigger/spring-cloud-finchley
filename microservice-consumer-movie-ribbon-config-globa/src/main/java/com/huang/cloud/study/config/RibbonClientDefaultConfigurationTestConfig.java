package com.huang.cloud.study.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author huangxiunian
 * @date 2021/1/24 23:03
 */

@RibbonClients(defaultConfiguration = DefaultRibbonConfig.class)
public class RibbonClientDefaultConfigurationTestConfig {
}

@Configuration
class DefaultRibbonConfig {

    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }

}
