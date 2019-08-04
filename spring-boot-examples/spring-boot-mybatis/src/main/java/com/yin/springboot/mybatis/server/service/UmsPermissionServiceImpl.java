package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.UmsPermissionMapper;
import com.yin.springboot.mybatis.domain.UmsPermission;
import com.yin.springboot.mybatis.server.UmsPermissionService;
@Service
public class UmsPermissionServiceImpl implements UmsPermissionService{

    @Resource
    private UmsPermissionMapper umsPermissionMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsPermissionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsPermission record) {
        return umsPermissionMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(UmsPermission record) {
        return umsPermissionMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UmsPermission record) {
        return umsPermissionMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(UmsPermission record) {
        return umsPermissionMapper.insertSelective(record);
    }

    @Override
    public UmsPermission selectByPrimaryKey(Long id) {
        return umsPermissionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsPermission record) {
        return umsPermissionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsPermission record) {
        return umsPermissionMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<UmsPermission> list) {
        return umsPermissionMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<UmsPermission> list) {
        return umsPermissionMapper.batchInsert(list);
    }

}
