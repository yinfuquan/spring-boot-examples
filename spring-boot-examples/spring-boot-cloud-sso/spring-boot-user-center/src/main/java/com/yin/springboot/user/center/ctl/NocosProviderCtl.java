package com.yin.springboot.user.center.ctl;

import com.github.pagehelper.PageHelper;
import com.yin.springboot.user.center.domain.TbUser;
import com.yin.springboot.user.center.mapper.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class NocosProviderCtl{
    @Resource
    private TbUserMapper tbUserMapper;
    @Autowired
    TbUserMapper userMapper;
    @GetMapping("/nacos/{message}")
    public String get(@PathVariable(value = "message") String message) {

        Example example = new Example(TbUser.class);
        example.createCriteria().andLike("username","ad%");
        PageHelper.startPage(1,1);
        List<TbUser> tbUsers = userMapper.selectByExample(example);
        System.out.println("");

       return tbUserMapper.selectByPrimaryKey(111).toString();

    }

}