package com.yin.springboot.mybatis.plus.server.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yin.springboot.mybatis.plus.mapper.RoleMapper;
import com.yin.springboot.mybatis.plus.domain.Role;
import java.util.List;
import com.yin.springboot.mybatis.plus.server.RoleService;
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService{

    @Override
    public int updateBatch(List<Role> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<Role> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(Role record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(Role record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
