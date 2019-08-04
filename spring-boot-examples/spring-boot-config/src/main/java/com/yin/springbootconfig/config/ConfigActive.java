package com.yin.springbootconfig.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/8/4
 * Time: 22:01
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@EnableConfigurationProperties(ConfigMain.class)
public class ConfigActive {
}
