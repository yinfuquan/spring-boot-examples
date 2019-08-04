package com.yin.springboot.product.product;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/26
 * Time: 22:07
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class ConfirmConfig {

    @Bean("confirmQueue")
    public Queue confirmQueue() {
        return new Queue("confirmQueue");

    }

    @Bean("confirmExchange")
    public DirectExchange confirmExchange() {
        return new DirectExchange("confirmExchange");

    }


    @Bean
    public Binding confirmBinding(@Qualifier("confirmQueue") Queue queueMessage,@Qualifier("confirmExchange") DirectExchange directExchange){

        return BindingBuilder.bind(queueMessage).to(directExchange).with("confirm");

    }
}
