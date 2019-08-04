package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.UmsRolePermissionRelation;
import com.yin.springboot.mybatis.mapper.UmsRolePermissionRelationMapper;
import com.yin.springboot.mybatis.server.UmsRolePermissionRelationService;
@Service
public class UmsRolePermissionRelationServiceImpl implements UmsRolePermissionRelationService{

    @Resource
    private UmsRolePermissionRelationMapper umsRolePermissionRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsRolePermissionRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsRolePermissionRelation record) {
        return umsRolePermissionRelationMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(UmsRolePermissionRelation record) {
        return umsRolePermissionRelationMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UmsRolePermissionRelation record) {
        return umsRolePermissionRelationMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(UmsRolePermissionRelation record) {
        return umsRolePermissionRelationMapper.insertSelective(record);
    }

    @Override
    public UmsRolePermissionRelation selectByPrimaryKey(Long id) {
        return umsRolePermissionRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsRolePermissionRelation record) {
        return umsRolePermissionRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsRolePermissionRelation record) {
        return umsRolePermissionRelationMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<UmsRolePermissionRelation> list) {
        return umsRolePermissionRelationMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<UmsRolePermissionRelation> list) {
        return umsRolePermissionRelationMapper.batchInsert(list);
    }

}
