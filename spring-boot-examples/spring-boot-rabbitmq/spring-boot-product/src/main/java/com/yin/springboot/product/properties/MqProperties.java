package com.yin.springboot.product.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/27
 * Time: 11:14
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@ConfigurationProperties(prefix = "spring.rabbitmq")
@Data
public class MqProperties {

    private String host;
    private Integer port;
    private String username;
    private String password;
}
