package com.yin.springboot.user.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootUserClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootUserClientApplication.class, args);
    }


    @GetMapping("/")
    public  String ssotest(){

        return "sso success";

    }
}
