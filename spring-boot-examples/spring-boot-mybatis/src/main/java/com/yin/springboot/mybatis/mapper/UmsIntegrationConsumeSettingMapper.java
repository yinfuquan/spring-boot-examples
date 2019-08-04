package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.UmsIntegrationConsumeSetting;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsIntegrationConsumeSettingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsIntegrationConsumeSetting record);

    int insertOrUpdate(UmsIntegrationConsumeSetting record);

    int insertOrUpdateSelective(UmsIntegrationConsumeSetting record);

    int insertSelective(UmsIntegrationConsumeSetting record);

    UmsIntegrationConsumeSetting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsIntegrationConsumeSetting record);

    int updateByPrimaryKey(UmsIntegrationConsumeSetting record);

    int updateBatch(List<UmsIntegrationConsumeSetting> list);

    int batchInsert(@Param("list") List<UmsIntegrationConsumeSetting> list);
}