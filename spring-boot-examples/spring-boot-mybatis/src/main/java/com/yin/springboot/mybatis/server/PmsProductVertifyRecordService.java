package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.PmsProductVertifyRecord;
public interface PmsProductVertifyRecordService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsProductVertifyRecord record);

    int insertOrUpdate(PmsProductVertifyRecord record);

    int insertOrUpdateSelective(PmsProductVertifyRecord record);

    int insertSelective(PmsProductVertifyRecord record);

    PmsProductVertifyRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductVertifyRecord record);

    int updateByPrimaryKey(PmsProductVertifyRecord record);

    int updateBatch(List<PmsProductVertifyRecord> list);

    int batchInsert(List<PmsProductVertifyRecord> list);

}
