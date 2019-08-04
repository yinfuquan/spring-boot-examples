package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.PmsProductVertifyRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductVertifyRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductVertifyRecord record);

    int insertOrUpdate(PmsProductVertifyRecord record);

    int insertOrUpdateSelective(PmsProductVertifyRecord record);

    int insertSelective(PmsProductVertifyRecord record);

    PmsProductVertifyRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductVertifyRecord record);

    int updateByPrimaryKey(PmsProductVertifyRecord record);

    int updateBatch(List<PmsProductVertifyRecord> list);

    int batchInsert(@Param("list") List<PmsProductVertifyRecord> list);
}