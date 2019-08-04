package com.yin.springboot.mybatis.plus.server.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.yin.springboot.mybatis.plus.domain.RolePermission;
import com.yin.springboot.mybatis.plus.mapper.RolePermissionMapper;
import com.yin.springboot.mybatis.plus.server.RolePermissionService;
@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermission> implements RolePermissionService{

    @Override
    public int updateBatch(List<RolePermission> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<RolePermission> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(RolePermission record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(RolePermission record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
