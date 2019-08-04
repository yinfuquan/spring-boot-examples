package com.yin.springboot.shiro.ctl;

import com.yin.springboot.shiro.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.DefaultPasswordService;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/29
 * Time: 20:43
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class LoginCtl {
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String redirect(HttpServletRequest request, User user, Model model) {
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
        Subject subject = SecurityUtils.getSubject();


            try {
                model.addAttribute("test", "测试一哈");
                subject.login(token);
            } catch (UnknownAccountException e) {
                model.addAttribute("error", "账号不对啊");
                return "unauthor";
            } catch (IncorrectCredentialsException e) {

                model.addAttribute("error", "密码不对啊");
                return "unauthor";
            } catch (AuthenticationException e) {
                model.addAttribute("error", "没有权限");

                return "unauthor";
            }

        return "index";
    }

    @RequestMapping("/unauthor")
    public String unauthor() {


        return "unauthor";
    }


    @RequestMapping("/logout")
    public String logout() {
        SecurityUtils.getSubject().logout();
        return "redirect:index";
    }
}
