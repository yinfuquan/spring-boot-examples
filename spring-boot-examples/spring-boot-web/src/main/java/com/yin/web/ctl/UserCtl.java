package com.yin.web.ctl;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/30
 * Time: 10:30
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/user")
public class UserCtl {


    @RequestMapping("/add")
    @RequiresPermissions({"user:add"})
    public String addUser() {
        SecurityUtils.getSubject().checkPermission("user:add");

        return "add";
    }

    @RequestMapping("/update")
    @RequiresPermissions({"user:update"})
    public String updateUser() {

        return "update";
    }
}
