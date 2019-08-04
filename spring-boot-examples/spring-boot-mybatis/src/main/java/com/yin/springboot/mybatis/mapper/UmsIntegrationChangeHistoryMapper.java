package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.UmsIntegrationChangeHistory;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsIntegrationChangeHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsIntegrationChangeHistory record);

    int insertOrUpdate(UmsIntegrationChangeHistory record);

    int insertOrUpdateSelective(UmsIntegrationChangeHistory record);

    int insertSelective(UmsIntegrationChangeHistory record);

    UmsIntegrationChangeHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsIntegrationChangeHistory record);

    int updateByPrimaryKey(UmsIntegrationChangeHistory record);

    int updateBatch(List<UmsIntegrationChangeHistory> list);

    int batchInsert(@Param("list") List<UmsIntegrationChangeHistory> list);
}