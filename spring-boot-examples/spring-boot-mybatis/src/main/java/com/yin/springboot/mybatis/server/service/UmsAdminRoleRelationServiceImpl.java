package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.UmsAdminRoleRelationMapper;
import com.yin.springboot.mybatis.domain.UmsAdminRoleRelation;
import com.yin.springboot.mybatis.server.UmsAdminRoleRelationService;
@Service
public class UmsAdminRoleRelationServiceImpl implements UmsAdminRoleRelationService{

    @Resource
    private UmsAdminRoleRelationMapper umsAdminRoleRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsAdminRoleRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsAdminRoleRelation record) {
        return umsAdminRoleRelationMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(UmsAdminRoleRelation record) {
        return umsAdminRoleRelationMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UmsAdminRoleRelation record) {
        return umsAdminRoleRelationMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(UmsAdminRoleRelation record) {
        return umsAdminRoleRelationMapper.insertSelective(record);
    }

    @Override
    public UmsAdminRoleRelation selectByPrimaryKey(Long id) {
        return umsAdminRoleRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsAdminRoleRelation record) {
        return umsAdminRoleRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsAdminRoleRelation record) {
        return umsAdminRoleRelationMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<UmsAdminRoleRelation> list) {
        return umsAdminRoleRelationMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<UmsAdminRoleRelation> list) {
        return umsAdminRoleRelationMapper.batchInsert(list);
    }

}
