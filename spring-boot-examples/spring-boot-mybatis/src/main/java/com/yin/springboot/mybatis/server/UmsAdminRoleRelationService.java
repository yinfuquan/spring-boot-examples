package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.UmsAdminRoleRelation;
public interface UmsAdminRoleRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminRoleRelation record);

    int insertOrUpdate(UmsAdminRoleRelation record);

    int insertOrUpdateSelective(UmsAdminRoleRelation record);

    int insertSelective(UmsAdminRoleRelation record);

    UmsAdminRoleRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdminRoleRelation record);

    int updateByPrimaryKey(UmsAdminRoleRelation record);

    int updateBatch(List<UmsAdminRoleRelation> list);

    int batchInsert(List<UmsAdminRoleRelation> list);

}
