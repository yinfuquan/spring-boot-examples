package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.UmsRolePermissionRelation;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsRolePermissionRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsRolePermissionRelation record);

    int insertOrUpdate(UmsRolePermissionRelation record);

    int insertOrUpdateSelective(UmsRolePermissionRelation record);

    int insertSelective(UmsRolePermissionRelation record);

    UmsRolePermissionRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsRolePermissionRelation record);

    int updateByPrimaryKey(UmsRolePermissionRelation record);

    int updateBatch(List<UmsRolePermissionRelation> list);

    int batchInsert(@Param("list") List<UmsRolePermissionRelation> list);
}