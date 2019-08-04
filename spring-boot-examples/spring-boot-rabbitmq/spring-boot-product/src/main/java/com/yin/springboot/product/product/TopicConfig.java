package com.yin.springboot.product.product;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/15
 * Time: 18:30
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class TopicConfig {

    @Bean(name = "TopicExchange-q1")
    public Queue queueMessage1() {
        return new Queue("topic.queue1");
    }

    @Bean(name = "TopicExchange-q2")
    public Queue queueMessage2() {
        return new Queue("topic.queue2.sss");
    }

    //方法名为bean的名称，，，，不要和其他的bean的name重复了
    @Bean
    public TopicExchange topicExchangexchange() {
        return new TopicExchange("topicExchange");
    }

    @Bean
    Binding topicBindingExchangeMessage1(@Qualifier("TopicExchange-q1") Queue q1, TopicExchange topicExchangexchange) {
        return BindingBuilder.bind(q1).to(topicExchangexchange).with("routing.#");
    }
//    @Bean
//    Binding topicBindingExchangeMessage2(@Qualifier("TopicExchange-q2") Queue q2, TopicExchange topicExchangexchange) {
//        return BindingBuilder.bind(q2).to(topicExchangexchange).with("routing2");
//    }
}
