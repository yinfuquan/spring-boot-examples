package com.yin.springboot.mybatis.plus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yin.springboot.mybatis.plus.domain.User;
import com.yin.springboot.mybatis.plus.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybatisPlusApplicationTests {

    @Test
    public void contextLoads() {
    }



    @Autowired
    UserMapper userMapper;

    //----- 普通查询 ------
    @Test
    public  void select(){

        //---------like------------
        List<User> c = userMapper.selectList(new QueryWrapper<User>().lambda().likeRight(User::getUsername, "c"));
    }

    //----- 分页查询 ------
    @Test
    public void  page(){

        Page<User> page = new Page<>(1, 3);

        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //  wrapper.lambda().eq(TUser::getUserId, 1);
        IPage<User> result = userMapper.selectPage(page, wrapper);
        System.out.println(result.getSize());
    }

    //----- 关联查询 ------
    @Test
    public  void  relect(){

        List<User> users = userMapper.selectList(new QueryWrapper<User>().lambda().inSql(User::getRoleId, "select id from tb_role r where r.id=38"));


        System.out.println(users.size());
    }
}
