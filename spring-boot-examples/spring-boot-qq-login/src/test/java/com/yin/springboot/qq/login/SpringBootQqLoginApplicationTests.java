package com.yin.springboot.qq.login;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootQqLoginApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println(RabbitConstant.EXCHANGE);
    }

}
