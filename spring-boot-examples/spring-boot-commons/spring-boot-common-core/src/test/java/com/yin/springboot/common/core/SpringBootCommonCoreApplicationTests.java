package com.yin.springboot.common.core;

import com.yin.springboot.common.core.mq.QueueEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootCommonCoreApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println(QueueEnum.QUEUE_ORDER_CANCEL.getExchange());
    }

}
