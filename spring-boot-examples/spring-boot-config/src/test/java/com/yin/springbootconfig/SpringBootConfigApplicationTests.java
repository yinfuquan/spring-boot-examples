package com.yin.springbootconfig;

import com.yin.springbootconfig.config.ConfigMain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootConfigApplicationTests {

    @Autowired
    private ConfigMain configMain;

    @Test
    public void contextLoads() {
        System.out.println(configMain.getConfig1().getName());
    }

}
