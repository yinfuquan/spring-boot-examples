package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.UmsPermission;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsPermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsPermission record);

    int insertOrUpdate(UmsPermission record);

    int insertOrUpdateSelective(UmsPermission record);

    int insertSelective(UmsPermission record);

    UmsPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsPermission record);

    int updateByPrimaryKey(UmsPermission record);

    int updateBatch(List<UmsPermission> list);

    int batchInsert(@Param("list") List<UmsPermission> list);
}