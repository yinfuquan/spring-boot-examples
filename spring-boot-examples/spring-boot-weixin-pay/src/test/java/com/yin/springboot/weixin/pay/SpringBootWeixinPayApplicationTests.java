package com.yin.springboot.weixin.pay;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootWeixinPayApplicationTests {

    @Test
    public void contextLoads() throws UnknownHostException {

        InetAddress addr = InetAddress.getLocalHost();
        String ip = addr.getHostAddress().toString();
        System.out.println(ip);
    }

}
