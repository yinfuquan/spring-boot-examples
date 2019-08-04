package com.yin.springboot.user.center.ctl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/10
 * Time: 22:51
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class LoginCtl {
    @RequestMapping("/login")
    public  String login(){
        return "login";

    }

    @RequestMapping("/index")
    public  String index(){
        return "index";

    }
}
