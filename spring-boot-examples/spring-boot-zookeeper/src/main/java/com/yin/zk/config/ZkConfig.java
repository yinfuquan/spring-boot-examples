package com.yin.zk.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/6/8
 * Time: 12:04
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@ConfigurationProperties(prefix = "zookeeper")
@Data
public class ZkConfig {

    private String server;
    private Integer sessionTimeoutMs;
    private Integer connectionTimeoutMs;
    private Integer maxRetries;
    private Integer baseSleepTimeMs;


}
