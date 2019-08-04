package com.yin.web.ctl;

import com.yin.web.entity.User;
import com.yin.web.entity.UserForm;
import com.yin.web.exception.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/29
 * Time: 20:43
 * To change this template use File | Settings | File Templates.
 */
@Controller
@Slf4j
public class LoginCtl {
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String redirect(HttpServletRequest request, @Valid UserForm user, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            log.error("【登录】参数不正确，user={}", user);
            throw new ServiceException(bindingResult.getFieldError().getDefaultMessage());
        }

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
