package com.yin.springboot.mybatis.plus.ctl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yin.springboot.mybatis.plus.base.BaseController;
import com.yin.springboot.mybatis.plus.wrapper.WrapMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/31
 * Time: 14:02
 * To change this template use File | Settings | File Templates.
 */
public class UserCtl extends BaseController {


   /* @Autowired
    private BaseUserServiceImpl baseUserService;

    @RequestMapping("/{id}")
    public Wrapper queryUserById(@PathVariable(value = "id") Long id){
        BaseUser baseUser = baseUserService.queryUserById(id);
        return WrapMapper.ok(baseUser);

    }
    @RequestMapping("/")
    public Wrapper< IPage<BaseUser>> queryUsers(){
        Page<BaseUser> page = new Page<>(1, 3);

        IPage<BaseUser> page1 = baseUserService.getBaseMapper().selectPage(page, new QueryWrapper<>());

        return WrapMapper.ok(page1);

    }*/
}
