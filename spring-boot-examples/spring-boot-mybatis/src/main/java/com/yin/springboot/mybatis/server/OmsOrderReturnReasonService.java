package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.OmsOrderReturnReason;
public interface OmsOrderReturnReasonService{


    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderReturnReason record);

    int insertOrUpdate(OmsOrderReturnReason record);

    int insertOrUpdateSelective(OmsOrderReturnReason record);

    int insertSelective(OmsOrderReturnReason record);

    OmsOrderReturnReason selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderReturnReason record);

    int updateByPrimaryKey(OmsOrderReturnReason record);

    int updateBatch(List<OmsOrderReturnReason> list);

    int batchInsert(List<OmsOrderReturnReason> list);

}
