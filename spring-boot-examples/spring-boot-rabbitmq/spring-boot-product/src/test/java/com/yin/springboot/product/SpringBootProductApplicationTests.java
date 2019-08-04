package com.yin.springboot.product;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootProductApplicationTests {

    @Autowired
    private AmqpTemplate amqpTemplate;


    /**
     * fanoutExchange
     */
    @Test
    public void fanout() {
        String context = "queue1" + LocalDate.now();
        System.out.println("Provider: " + context);
        amqpTemplate.convertAndSend("fanoutExchange","", context);

        String context2 = "queue2" + LocalDate.now();
        System.out.println("Provider: " + context2);
        amqpTemplate.convertAndSend("fanoutExchange","", context2);
    }


    /**
     * topicExchange
     */
    @Test
    public void topic() {
        String context = "topic1" + LocalDate.now();
        System.out.println("Provider: " + context);
        amqpTemplate.convertAndSend("topicExchange","routing.bbbbb", context);

//        String context2 = "topic2" + LocalDate.now();
//        System.out.println("Provider: " + context2);
//        amqpTemplate.convertAndSend("topicExchange","topic2", context2);
    }

    /**
     * topicExchange
     */
    @Test
    public void direct() {
        String context = "direct2" + LocalDateTime.now();
        System.out.println("Provider: " + context);
        amqpTemplate.convertAndSend("Directexchange","direct.message", context);

    }

}
