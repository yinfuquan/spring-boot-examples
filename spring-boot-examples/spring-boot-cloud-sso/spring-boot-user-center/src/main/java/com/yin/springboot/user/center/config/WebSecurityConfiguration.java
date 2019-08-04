package com.yin.springboot.user.center.config;

import com.yin.springboot.user.center.config.loginconfig.LoginSuccessHandler;
import com.yin.springboot.user.center.config.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    //======================基于内存（这里不用配置，配置zhanghao）=================================================================================
   /* @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                // 在内存中创建用户并为密码加密
                .withUser("user").password(passwordEncoder().encode("123456")).roles("USER")
                .and()
                .withUser("admin").password(passwordEncoder().encode("123456")).roles("ADMIN");

    }
    */


    //======================jdbc=================================================================================

//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        // 将 check_token 暴露出去，否则资源服务器访问时报 403 错误
//        web.ignoring().antMatchers("/oauth/check_token");
//            web.ignoring().antMatchers("static/**");
//    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        // 设置默认的加密方式
        return new BCryptPasswordEncoder();
    }

//        @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//
//        auth.inMemoryAuthentication()
//                // 在内存中创建用户并为密码加密
//                .withUser("user").password(passwordEncoder().encode("123456")).roles("USER").authorities("add")
//                .and()
//                .withUser("admin").password(passwordEncoder().encode("123456")).roles("ADMIN");
//
//    }
    @Autowired
    private LoginSuccessHandler loginSuccessHandler;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests()
                //设置权限
                .antMatchers("/nacos/**").permitAll()
                .antMatchers("/addUser").hasAnyAuthority("add_user")
                .antMatchers("/login").permitAll()
                .antMatchers("/css/**", "/images/**", "/js/**", "/layui/**").permitAll()
                //.anyRequest().hasRole("USER")
                .anyRequest().authenticated()
                .and()
                // 关闭跨站拦截
                .csrf()
                //关闭跨站拦截的具体路径
                //   .requireCsrfProtectionMatcher(new AntPathRequestMatcher("/oauth/authorize"))
                .disable()

                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login")

                .and()
                .formLogin()
                .successHandler(loginSuccessHandler)
//                .loginProcessingUrl("/my/login")
                .loginPage("/login");

    }


//        @Bean
//    public BCryptPasswordEncoder passwordEncoder() {
//        // 设置默认的加密方式
//        return new BCryptPasswordEncoder();
//    }

    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        return new UserDetailsServiceImpl();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // 使用自定义认证与授权
        auth.userDetailsService(userDetailsService());
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        // 将 check_token 暴露出去，否则资源服务器访问时报 403 错误
        web.ignoring().antMatchers("/oauth/check_token");
        web.ignoring().antMatchers("static/**");

    }

}
