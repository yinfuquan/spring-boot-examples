package com.yin.springboot.consumer.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = {"Fanoutq1"})
public class FanoutConsumer {
    @RabbitHandler
    public void process(String message) {
        System.out.println("FanoutConsumer1: " + message);
    }
}
@Component
@RabbitListener(queues = {"Fanoutq2"})
class  consumer2{
    @RabbitHandler
    public void process(String message) {
        System.out.println("FanoutConsumer2: " + message);
    }
}