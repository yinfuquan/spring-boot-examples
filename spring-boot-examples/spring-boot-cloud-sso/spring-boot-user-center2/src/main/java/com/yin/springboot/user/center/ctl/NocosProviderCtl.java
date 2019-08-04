package com.yin.springboot.user.center.ctl;

import com.yin.springboot.user.center.mapper.TbUserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class NocosProviderCtl{
    @Resource
    private TbUserMapper tbUserMapper;

    @GetMapping("/nacos/{message}")
    public String get(@PathVariable(value = "message") String message) {

       return tbUserMapper.selectByPrimaryKey(111).toString();

    }

}