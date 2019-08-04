package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.UmsIntegrationChangeHistory;
public interface UmsIntegrationChangeHistoryService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsIntegrationChangeHistory record);

    int insertOrUpdate(UmsIntegrationChangeHistory record);

    int insertOrUpdateSelective(UmsIntegrationChangeHistory record);

    int insertSelective(UmsIntegrationChangeHistory record);

    UmsIntegrationChangeHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsIntegrationChangeHistory record);

    int updateByPrimaryKey(UmsIntegrationChangeHistory record);

    int updateBatch(List<UmsIntegrationChangeHistory> list);

    int batchInsert(List<UmsIntegrationChangeHistory> list);

}
