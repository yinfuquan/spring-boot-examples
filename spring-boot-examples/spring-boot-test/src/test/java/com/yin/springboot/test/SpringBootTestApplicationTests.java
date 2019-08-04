package com.yin.springboot.test;

import com.yin.springboot.test.id.SnowFlake;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CountDownLatch;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTestApplicationTests {

    @Test
    public void contextLoads() {
        long parseLong = Long.parseLong(null);
        System.out.println("");
    }

}
