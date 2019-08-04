package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.OmsOrderItem;
public interface OmsOrderItemService{


    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderItem record);

    int insertOrUpdate(OmsOrderItem record);

    int insertOrUpdateSelective(OmsOrderItem record);

    int insertSelective(OmsOrderItem record);

    OmsOrderItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderItem record);

    int updateByPrimaryKey(OmsOrderItem record);

    int updateBatch(List<OmsOrderItem> list);

    int batchInsert(List<OmsOrderItem> list);

}
