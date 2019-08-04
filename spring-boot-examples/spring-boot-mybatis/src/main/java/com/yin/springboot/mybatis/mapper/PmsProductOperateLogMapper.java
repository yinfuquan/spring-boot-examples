package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.PmsProductOperateLog;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductOperateLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductOperateLog record);

    int insertOrUpdate(PmsProductOperateLog record);

    int insertOrUpdateSelective(PmsProductOperateLog record);

    int insertSelective(PmsProductOperateLog record);

    PmsProductOperateLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductOperateLog record);

    int updateByPrimaryKey(PmsProductOperateLog record);

    int updateBatch(List<PmsProductOperateLog> list);

    int batchInsert(@Param("list") List<PmsProductOperateLog> list);
}