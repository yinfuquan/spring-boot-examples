package com.yin.springboot.mybatis.server;

import com.yin.springboot.mybatis.domain.UmsAdminPermissionRelation;
import java.util.List;
public interface UmsAdminPermissionRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminPermissionRelation record);

    int insertOrUpdate(UmsAdminPermissionRelation record);

    int insertOrUpdateSelective(UmsAdminPermissionRelation record);

    int insertSelective(UmsAdminPermissionRelation record);

    UmsAdminPermissionRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdminPermissionRelation record);

    int updateByPrimaryKey(UmsAdminPermissionRelation record);

    int updateBatch(List<UmsAdminPermissionRelation> list);

    int batchInsert(List<UmsAdminPermissionRelation> list);

}
