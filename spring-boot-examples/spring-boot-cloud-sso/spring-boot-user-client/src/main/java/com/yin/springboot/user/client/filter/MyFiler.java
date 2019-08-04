package com.yin.springboot.user.client.filter;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/11
 * Time: 23:53
 * To change this template use File | Settings | File Templates.
 */
@Component
public class MyFiler implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;


        HttpSession session = request.getSession();

        Object access_token = session.getAttribute("access_token");
        if(null != access_token){
            filterChain.doFilter(servletRequest, servletResponse);
        }

//        session.setAttribute("hahaha","aaaaaaaa");
//        Cookie[] cookies = request.getCookies();
//
//        for (Cookie cookie : cookies) {
//            if(cookie.getName().equals("JSESSIONID")){
//                String value = cookie.getValue();
//                System.out.println(value);
//                System.out.println(session.getAttribute(value));
//                filterChain.doFilter(servletRequest, servletResponse);
//                return;
//            }
//        }



        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.sendRedirect("http://localhost:8083/oauth/authorize?client_id=client&response_type=code");

    }
}
