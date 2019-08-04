package com.yin.springboot.mybatis;

import com.yin.springboot.mybatis.mapper.OmsOrderMapper;
import com.yin.springboot.mybatis.server.OmsOrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybatisApplicationTests {

    @Autowired
    OmsOrderService omsOrderService;

    @Autowired
    OmsOrderMapper omsOrderMapper;
    @Test
    public void contextLoads() {

        System.out.println(omsOrderService.selectByPrimaryKey(13L).toString());
    }
    @Test
    public void cont() {

       OrderTestSql list=omsOrderMapper.selectOrderitemListById(13L);

        System.out.println(omsOrderMapper.selectOrderitemListById(13L).toString());
    }

    @Test
    public void cont1() {

        OrderTestSql list=omsOrderMapper.selectOneOrderitemListById(13L);

        System.out.println(list.toString());
    }
}
