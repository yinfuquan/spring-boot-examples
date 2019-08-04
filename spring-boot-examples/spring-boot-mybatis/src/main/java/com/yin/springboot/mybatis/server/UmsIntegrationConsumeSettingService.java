package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.UmsIntegrationConsumeSetting;
public interface UmsIntegrationConsumeSettingService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsIntegrationConsumeSetting record);

    int insertOrUpdate(UmsIntegrationConsumeSetting record);

    int insertOrUpdateSelective(UmsIntegrationConsumeSetting record);

    int insertSelective(UmsIntegrationConsumeSetting record);

    UmsIntegrationConsumeSetting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsIntegrationConsumeSetting record);

    int updateByPrimaryKey(UmsIntegrationConsumeSetting record);

    int updateBatch(List<UmsIntegrationConsumeSetting> list);

    int batchInsert(List<UmsIntegrationConsumeSetting> list);

}
