package com.yin.springboot.user.center;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootUserCenterApplicationTests {

    @Test
    public void contextLoads() {


        System.out.println("mm"+new BCryptPasswordEncoder().encode("secret"));
    }

}
