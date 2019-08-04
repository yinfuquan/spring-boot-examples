package com.yin.springboot.mybatis.plus.server.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yin.springboot.mybatis.plus.domain.Permission;
import java.util.List;
import com.yin.springboot.mybatis.plus.mapper.PermissionMapper;
import com.yin.springboot.mybatis.plus.server.PermissionService;
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService{

    @Override
    public int updateBatch(List<Permission> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<Permission> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(Permission record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(Permission record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
