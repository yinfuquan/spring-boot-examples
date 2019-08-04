package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.PmsProductOperateLog;
public interface PmsProductOperateLogService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsProductOperateLog record);

    int insertOrUpdate(PmsProductOperateLog record);

    int insertOrUpdateSelective(PmsProductOperateLog record);

    int insertSelective(PmsProductOperateLog record);

    PmsProductOperateLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductOperateLog record);

    int updateByPrimaryKey(PmsProductOperateLog record);

    int updateBatch(List<PmsProductOperateLog> list);

    int batchInsert(List<PmsProductOperateLog> list);

}
