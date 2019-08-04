package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.OmsOrderOperateHistory;
public interface OmsOrderOperateHistoryService{


    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderOperateHistory record);

    int insertOrUpdate(OmsOrderOperateHistory record);

    int insertOrUpdateSelective(OmsOrderOperateHistory record);

    int insertSelective(OmsOrderOperateHistory record);

    OmsOrderOperateHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderOperateHistory record);

    int updateByPrimaryKey(OmsOrderOperateHistory record);

    int updateBatch(List<OmsOrderOperateHistory> list);

    int batchInsert(List<OmsOrderOperateHistory> list);

}
