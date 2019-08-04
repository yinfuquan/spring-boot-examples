package com.yin.springboot.product.product;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DirectConfig {

    @Bean(name = "directq1")
    public Queue queueMessage() {
        return new Queue("directq1");
    }
    @Bean(name = "directq2")
    public Queue queueMessage2() {
        return new Queue("directq2");
    }

    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange("Directexchange");
    }

    @Bean
    Binding directbindingExchangeMessage(@Qualifier("directq1") Queue queueMessage, DirectExchange directExchange) {
        return BindingBuilder.bind(queueMessage).to(directExchange).with("direct.message");
    }
    @Bean
    Binding directbindingExchangeMessage2(@Qualifier("directq2") Queue queueMessage, DirectExchange directExchange) {
        return BindingBuilder.bind(queueMessage).to(directExchange).with("direct.message");
    }
}