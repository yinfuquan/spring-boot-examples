package com.yin.springboot.consumer.consumer;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/26
 * Time: 22:25
 * To change this template use File | Settings | File Templates.
 */

@Component
@RabbitListener(queues = {"confirmQueue"})
public class ConfirmConsumer {

    @RabbitHandler
    public void process(String message, Channel channel, @Headers Map<String, Object> headers) throws IOException {
        Long deliveryTag = (Long)headers.get(AmqpHeaders.DELIVERY_TAG);
        channel.basicAck(deliveryTag, false);

        System.out.println("confirmQueue: " + message);
    }


}
