package com.yin.springboot.mybatis.plus.server.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yin.springboot.mybatis.plus.mapper.UserMapper;
import java.util.List;
import com.yin.springboot.mybatis.plus.domain.User;
import com.yin.springboot.mybatis.plus.server.UserService;
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

    @Override
    public int updateBatch(List<User> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<User> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(User record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(User record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
