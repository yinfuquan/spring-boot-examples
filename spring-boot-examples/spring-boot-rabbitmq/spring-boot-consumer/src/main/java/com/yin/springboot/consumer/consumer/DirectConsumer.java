package com.yin.springboot.consumer.consumer;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/15
 * Time: 22:50
 * To change this template use File | Settings | File Templates.
 */
@Component
@RabbitListener(bindings = @QueueBinding(value = @Queue(value = "directq1", autoDelete = "true")
        , exchange = @Exchange(value = "Directexchange", type = ExchangeTypes.DIRECT), key = "direct.message"))
public class DirectConsumer {

    @RabbitHandler
    public void process(String message) {
        System.out.println("topicConsumer1: " + message);
    }
}

@Component
@RabbitListener(queues = {"directq2"})
class DirectConsumer2 {

    @RabbitHandler
    public void process(String message)

    {
        System.out.println("topicConsumer2: " + message);
    }
}