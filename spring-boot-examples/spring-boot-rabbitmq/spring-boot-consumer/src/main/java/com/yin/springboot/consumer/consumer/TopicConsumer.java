package com.yin.springboot.consumer.consumer;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/15
 * Time: 18:33
 * To change this template use File | Settings | File Templates.
 */
@Component
@RabbitListener(queues = {"topic.queue1"})

@RabbitListener(bindings = @QueueBinding(value = @Queue(value = "topic.queue1", autoDelete = "true")
        , exchange = @Exchange(value = "topicExchange", type = ExchangeTypes.TOPIC), key = "topic.*"))
public class TopicConsumer {

    @RabbitHandler
    public void process(String message) {
        System.out.println("topicConsumer1: " + message);
    }
}

//@Component
//@RabbitListener(queues = {"Topicq2"})
//class TopicConsumer2 {
//
//    @RabbitHandler
//    public void process(String message) {
//        System.out.println("topicConsumer2: " + message);
//    }
//}
