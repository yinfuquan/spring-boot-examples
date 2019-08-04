package com.yin.springboot.weixin.pay.ctl;

import com.yin.springboot.weixin.pay.imagecode.ImageCodeUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/16
 * Time: 23:12
 * To change this template use File | Settings | File Templates.
 */
@Controller
@Slf4j
public class ImageCtl {

@RequestMapping("/")
    public  void  createImage(HttpServletResponse response){

    ImageCodeUtils.createQrcode(response,"http://localhost:8043",400,400);
    }


    @RequestMapping("/index")
    public  String  index(HttpServletRequest servletRequest){
        byte[] qrcodeByte = ImageCodeUtils.createQrcodeByte("http://localhost:8043", 400, null);
        servletRequest.getSession(true).setAttribute("qrcode", qrcodeByte);
    return "index.html";
    }

    @RequestMapping("/qrcode")
    public void watercode(HttpServletRequest request, HttpServletResponse response) {

        response.setContentType("image/jpeg");// 设置相应类型,告诉浏览器输出的内容为图片
        response.setHeader("Pragma", "No-cache");// 设置响应头信息，告诉浏览器不要缓存此内容
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expire", 0);

        try {
            byte[] result = (byte[]) request.getSession(true).getAttribute("qrcode");
            response.getOutputStream().write(result);
            response.flushBuffer();
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }
    }
}
