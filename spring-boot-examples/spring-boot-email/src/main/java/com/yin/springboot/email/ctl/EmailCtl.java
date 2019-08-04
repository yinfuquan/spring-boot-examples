package com.yin.springboot.email.ctl;

import com.yin.springboot.email.ResultBean;
import com.yin.springboot.email.User;
import com.yin.springboot.email.service.MailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/8/2
 * Time: 20:14
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class EmailCtl {
    @Resource
    private TemplateEngine templateEngine;

    @Resource
    private MailService mailService;

    @PostMapping("/register")
    @ResponseBody
    public ResultBean register(User user) {
//        userService.checkUserNameExistOnCreate(user.getUsername());
      String activeCode = UUID.randomUUID().toString();
        user.setActiveCode(activeCode);
        user.setStatus("0");

        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String url = request.getScheme() + "://"
                + request.getServerName()
                + ":"
                + request.getServerPort()
                + "/active/"
                + activeCode;
        Context context = new Context();
        context.setVariable("url", url);
        String mailContent = templateEngine.process("mail/registerTemplate", context);
        new Thread(() ->
                mailService.sendHTMLMail(user.getEmail(), "Shiro-Action 激活邮件", mailContent))
                .start();

        // 注册后默认的角色, 根据自己数据库的角色表 ID 设置
        Integer[] initRoleIds = {2};
//        return ResultBean.success(userService.add(user, initRoleIds));
        return ResultBean.success();
    }

}
