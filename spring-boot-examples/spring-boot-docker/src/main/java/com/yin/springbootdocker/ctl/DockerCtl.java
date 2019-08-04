package com.yin.springbootdocker.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/6
 * Time: 12:42
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class DockerCtl {

    @GetMapping("/")
    public String test(){

        return "docker-image-success";

    }

}
