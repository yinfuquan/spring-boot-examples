package com.yin.springboot.product.utils;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.yin.springboot.product.properties.MqProperties;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/26
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
@Component
public class ConnectionUtils implements InitializingBean {
   @Autowired
   private MqProperties properties;

    private static ConnectionFactory factory;

    public static Connection getConnection() throws IOException, TimeoutException {


        return factory.newConnection();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        factory=new ConnectionFactory();
        factory.setHost(properties.getHost());
        factory.setPort(properties.getPort());
        factory.setUsername(properties.getUsername());
        factory.setPassword(properties.getPassword());

    }
}
