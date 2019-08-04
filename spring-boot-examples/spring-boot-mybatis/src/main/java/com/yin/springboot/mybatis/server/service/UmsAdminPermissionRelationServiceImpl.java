package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yin.springboot.mybatis.domain.UmsAdminPermissionRelation;
import java.util.List;
import com.yin.springboot.mybatis.mapper.UmsAdminPermissionRelationMapper;
import com.yin.springboot.mybatis.server.UmsAdminPermissionRelationService;
@Service
public class UmsAdminPermissionRelationServiceImpl implements UmsAdminPermissionRelationService{

    @Resource
    private UmsAdminPermissionRelationMapper umsAdminPermissionRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsAdminPermissionRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsAdminPermissionRelation record) {
        return umsAdminPermissionRelationMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(UmsAdminPermissionRelation record) {
        return umsAdminPermissionRelationMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UmsAdminPermissionRelation record) {
        return umsAdminPermissionRelationMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(UmsAdminPermissionRelation record) {
        return umsAdminPermissionRelationMapper.insertSelective(record);
    }

    @Override
    public UmsAdminPermissionRelation selectByPrimaryKey(Long id) {
        return umsAdminPermissionRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsAdminPermissionRelation record) {
        return umsAdminPermissionRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsAdminPermissionRelation record) {
        return umsAdminPermissionRelationMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<UmsAdminPermissionRelation> list) {
        return umsAdminPermissionRelationMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<UmsAdminPermissionRelation> list) {
        return umsAdminPermissionRelationMapper.batchInsert(list);
    }

}
