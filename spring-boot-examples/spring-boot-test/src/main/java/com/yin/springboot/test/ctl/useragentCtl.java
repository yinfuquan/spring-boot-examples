package com.yin.springboot.test.ctl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/8/3
 * Time: 18:02
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class useragentCtl {

    @RequestMapping("/")
    @ResponseBody
    public String agent(HttpServletRequest request) {

        System.out.println(request.getHeader("user-agent"));
        return request.getHeader("user-agent");
    }

}
