package com.yin.springboot.user.center;

import com.github.pagehelper.PageHelper;
import com.yin.springboot.common.utils.json.FastjsonUtil;
import com.yin.springboot.common.utils.json.GsonUtil;
import com.yin.springboot.user.center.domain.TbUser;
import com.yin.springboot.user.center.mapper.TbUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootUserCenterApplicationTests {
@Autowired
    TbUserMapper userMapper;



@Test
public  void assert1(){

    try {
        Assert.notNull(null, "authenticationManager cannot be null");
    }catch (RuntimeException e) {
        System.out.println(e.getMessage());
    }


    System.out.println("skip error");
    }
    @Test
    public void contextLoads() {


        System.out.println("mm"+new BCryptPasswordEncoder().encode("secret"));
    }

    @Test
    public  void  test1(){
        Example example = new Example(TbUser.class);
        example.createCriteria().andLike("username","ad%");
        PageHelper.startPage(1,1);
        List<TbUser> tbUsers = userMapper.selectByExample(example);
        System.out.println("");
    }
}
