package com.yin.springboot.product.product;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/15
 * Time: 17:12
 *
 *
 *
 *
 * 发送到fanout交换机的消息 会发送到与fanout绑定的所有队列
 */
@Configuration
public class FanoutConfig {

    @Bean(name = "FanoutExchange-q1")
    public Queue queueMessage1() {
        return new Queue("Fanoutq1");
    }

    @Bean(name = "FanoutExchange-q2")
    public Queue queueMessage2() {
        return new Queue("Fanoutq2");
    }
    //方法名exchange为bean的名称，，，，不要和其他的bean的name重复了
    @Bean
    public FanoutExchange exchange() {
        return new FanoutExchange("fanoutExchange");
    }

    @Bean
    Binding bindingExchangeMessage(@Qualifier("FanoutExchange-q1") Queue Fanoutq1, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(Fanoutq1).to(fanoutExchange);
    }
    @Bean
    Binding bindingExchangeMessage2(@Qualifier("FanoutExchange-q2") Queue Fanoutq2, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(Fanoutq2).to(fanoutExchange);
    }
}
