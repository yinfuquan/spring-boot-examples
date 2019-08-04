package com.yin.springboot.user.client.ctl;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/11
 * Time: 18:55
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class ViewCtl {

    @GetMapping("/contents/view/{id}")
    public String  getById(@PathVariable Long id) {
        return "view";
    }


    @RequestMapping("callback")
    public  void  getTOcken(HttpServletRequest request){
        System.out.println("back");

    }


}
