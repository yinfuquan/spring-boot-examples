package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.UmsAdminPermissionRelation;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsAdminPermissionRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminPermissionRelation record);

    int insertOrUpdate(UmsAdminPermissionRelation record);

    int insertOrUpdateSelective(UmsAdminPermissionRelation record);

    int insertSelective(UmsAdminPermissionRelation record);

    UmsAdminPermissionRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdminPermissionRelation record);

    int updateByPrimaryKey(UmsAdminPermissionRelation record);

    int updateBatch(List<UmsAdminPermissionRelation> list);

    int batchInsert(@Param("list") List<UmsAdminPermissionRelation> list);
}