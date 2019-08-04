package com.yin.springboot.shiro.ctl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/29
 * Time: 20:31
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class IndexCtl {

    @RequestMapping("/index")
    public  String index(){
        return  "index";
    }

}
