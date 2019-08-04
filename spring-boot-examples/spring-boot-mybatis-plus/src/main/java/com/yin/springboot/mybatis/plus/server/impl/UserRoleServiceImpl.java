package com.yin.springboot.mybatis.plus.server.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.yin.springboot.mybatis.plus.mapper.UserRoleMapper;
import com.yin.springboot.mybatis.plus.domain.UserRole;
import com.yin.springboot.mybatis.plus.server.UserRoleService;
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService{

    @Override
    public int updateBatch(List<UserRole> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<UserRole> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(UserRole record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(UserRole record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
