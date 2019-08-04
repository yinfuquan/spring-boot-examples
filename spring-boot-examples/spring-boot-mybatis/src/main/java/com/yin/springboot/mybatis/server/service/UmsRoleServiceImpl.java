package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.UmsRoleMapper;
import com.yin.springboot.mybatis.domain.UmsRole;
import com.yin.springboot.mybatis.server.UmsRoleService;
@Service
public class UmsRoleServiceImpl implements UmsRoleService{

    @Resource
    private UmsRoleMapper umsRoleMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsRole record) {
        return umsRoleMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(UmsRole record) {
        return umsRoleMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UmsRole record) {
        return umsRoleMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(UmsRole record) {
        return umsRoleMapper.insertSelective(record);
    }

    @Override
    public UmsRole selectByPrimaryKey(Long id) {
        return umsRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsRole record) {
        return umsRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsRole record) {
        return umsRoleMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<UmsRole> list) {
        return umsRoleMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<UmsRole> list) {
        return umsRoleMapper.batchInsert(list);
    }

}
