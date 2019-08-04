package com.yin.web.ctl;

import com.yin.web.entity.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

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

    @RequestMapping("/testVo")
    @ResponseBody
    public UserVo testVo(){

        UserVo userVo = new UserVo();
        userVo.setUserId(1L);
        userVo.setUsername("yin");
        userVo.setUserPassword("123");
        userVo.setLoginTime(new Date());
        return  userVo;
    }

}
