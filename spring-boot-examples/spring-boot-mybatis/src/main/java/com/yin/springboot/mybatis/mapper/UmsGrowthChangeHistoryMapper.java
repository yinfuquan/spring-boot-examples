package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.UmsGrowthChangeHistory;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsGrowthChangeHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsGrowthChangeHistory record);

    int insertOrUpdate(UmsGrowthChangeHistory record);

    int insertOrUpdateSelective(UmsGrowthChangeHistory record);

    int insertSelective(UmsGrowthChangeHistory record);

    UmsGrowthChangeHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsGrowthChangeHistory record);

    int updateByPrimaryKey(UmsGrowthChangeHistory record);

    int updateBatch(List<UmsGrowthChangeHistory> list);

    int batchInsert(@Param("list") List<UmsGrowthChangeHistory> list);
}