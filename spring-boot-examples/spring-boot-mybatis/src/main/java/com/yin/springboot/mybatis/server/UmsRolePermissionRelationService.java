package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.UmsRolePermissionRelation;
public interface UmsRolePermissionRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsRolePermissionRelation record);

    int insertOrUpdate(UmsRolePermissionRelation record);

    int insertOrUpdateSelective(UmsRolePermissionRelation record);

    int insertSelective(UmsRolePermissionRelation record);

    UmsRolePermissionRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsRolePermissionRelation record);

    int updateByPrimaryKey(UmsRolePermissionRelation record);

    int updateBatch(List<UmsRolePermissionRelation> list);

    int batchInsert(List<UmsRolePermissionRelation> list);

}
