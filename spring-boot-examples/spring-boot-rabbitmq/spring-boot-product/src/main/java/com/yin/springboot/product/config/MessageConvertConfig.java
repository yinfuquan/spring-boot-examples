package com.yin.springboot.product.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/20
 * Time: 20:47
 * To change this template use File | Settings | File Templates.
 */
@Component
public class MessageConvertConfig {


    /**
     * 发送对象配置
     * @return
     */
    @Bean
   public MessageConverter jacksaon(){
        return  new Jackson2JsonMessageConverter();
    }

}
