package com.yin.springboot.product;

import com.rabbitmq.client.Connection;
import com.yin.springboot.product.utils.ConnectionUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.TimeoutException;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/26
 * Time: 22:00
 * To change this template use File | Settings | File Templates.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestReturnConfirm {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    //回调函数: confirm确认
    final RabbitTemplate.ConfirmCallback confirmCallback = new RabbitTemplate.ConfirmCallback() {
        @Override
        public void confirm(CorrelationData correlationData, boolean ack, String cause) {

            System.out.println("recive confirm");

            if(!ack){
                System.out.println("异常处理....");
            }
        }
    };

    //回调函数: return返回
    final RabbitTemplate.ReturnCallback returnCallback = new RabbitTemplate.ReturnCallback() {
        @Override
        public void returnedMessage(org.springframework.amqp.core.Message message, int replyCode,
                                    String replyText, String exchange, String routingKey) {
            String format = String.format("return exchange: {}, routingKey: {}, replyCode: {}, replyText: {}", exchange, routingKey, replyCode, replyText);
            System.out.println(format);

        }
    };


    //发送消息方法调用: 构建Message消息
    @Test
    public void send() throws Exception {
        rabbitTemplate.setConfirmCallback(confirmCallback);
        rabbitTemplate.setReturnCallback(returnCallback);
        //id + 时间戳 全局唯一
        String id = UUID.randomUUID().toString();
        CorrelationData correlationData = new CorrelationData(id);
        rabbitTemplate.convertAndSend("confirmQueue", "confirm", "ss", correlationData);
        System.out.println("complate");
    }


    @Test

    public  void  test() throws IOException, TimeoutException {

        Connection connection = ConnectionUtils.getConnection();
        System.out.println("");

    }

}
