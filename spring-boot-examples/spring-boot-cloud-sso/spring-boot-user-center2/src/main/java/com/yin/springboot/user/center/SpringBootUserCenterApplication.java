package com.yin.springboot.user.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@EnableDiscoveryClient
@SpringBootApplication

@MapperScan("com.yin.springboot.user.center.mapper")
public class SpringBootUserCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootUserCenterApplication.class, args);
    }

}
