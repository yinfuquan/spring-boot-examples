package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.OmsOrderOperateHistory;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderOperateHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderOperateHistory record);

    int insertOrUpdate(OmsOrderOperateHistory record);

    int insertOrUpdateSelective(OmsOrderOperateHistory record);

    int insertSelective(OmsOrderOperateHistory record);

    OmsOrderOperateHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderOperateHistory record);

    int updateByPrimaryKey(OmsOrderOperateHistory record);

    int updateBatch(List<OmsOrderOperateHistory> list);

    int batchInsert(@Param("list") List<OmsOrderOperateHistory> list);
}