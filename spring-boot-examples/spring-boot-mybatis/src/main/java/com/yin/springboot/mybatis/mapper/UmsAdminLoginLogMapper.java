package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.UmsAdminLoginLog;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsAdminLoginLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminLoginLog record);

    int insertOrUpdate(UmsAdminLoginLog record);

    int insertOrUpdateSelective(UmsAdminLoginLog record);

    int insertSelective(UmsAdminLoginLog record);

    UmsAdminLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdminLoginLog record);

    int updateByPrimaryKey(UmsAdminLoginLog record);

    int updateBatch(List<UmsAdminLoginLog> list);

    int batchInsert(@Param("list") List<UmsAdminLoginLog> list);
}