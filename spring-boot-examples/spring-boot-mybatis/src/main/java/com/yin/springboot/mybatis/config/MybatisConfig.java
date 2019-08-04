package com.yin.springboot.mybatis.config;

import com.yin.springboot.mybatis.plugin.MybatisPlugin;
import com.yin.springboot.mybatis.plugin.ResultHandlerPlugin;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/14
 * Time: 17:43
 * To change this template use File | Settings | File Templates.
 */


@Configuration
public class MybatisConfig {
    @Bean
    public MybatisPlugin mybatisPlugin() {

        return new MybatisPlugin();

    }
//    @Bean
//    public ResultHandlerPlugin resultHandlerPlugin(){
//
//        return  new ResultHandlerPlugin();
//    }

    @Bean

    public ConfigurationCustomizer configurationCustomizer(){

        return  new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {

                configuration.addInterceptor(mybatisPlugin());
//                configuration.addInterceptor(resultHandlerPlugin());

            }
        };

    }

}
