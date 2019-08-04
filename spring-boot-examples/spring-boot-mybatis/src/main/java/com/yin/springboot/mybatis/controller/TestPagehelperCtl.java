package com.yin.springboot.mybatis.controller;

import com.github.pagehelper.PageHelper;
import com.yin.springboot.mybatis.domain.OmsOrder;
import com.yin.springboot.mybatis.mapper.OmsOrderMapper;
import org.apache.ibatis.cursor.Cursor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/14
 * Time: 11:38
 * To change this template use File | Settings | File Templates.
 */

@RestController
public class TestPagehelperCtl {
    @Autowired
    private OmsOrderMapper orderMapper;

    @GetMapping("/")
    public String page() {
      //  PageHelper.startPage(1, 2);

        List<OmsOrder> omsOrder = orderMapper.selectAll();


        Cursor<OmsOrder> orders=  orderMapper.selectCursor();
        return "ok";

    }

}
