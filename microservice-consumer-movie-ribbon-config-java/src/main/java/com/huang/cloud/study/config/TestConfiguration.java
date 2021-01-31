package com.huang.cloud.study.config;

import com.huang.cloud.config.RibbonConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * 使用RibbonClient，为特定的目标服务自定义配置
 * 使用@RibbonClient的configuration属性，指定Ribbon的配置类
 * @author huangxiunian
 * @date 2021/1/22 23:16
 */

@Configuration
@RibbonClient(name = "microservice-provider-user", configuration = RibbonConfiguration.class)
public class TestConfiguration {
}
