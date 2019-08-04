package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.OmsOrder;
public interface OmsOrderService{


    int deleteByPrimaryKey(Long id);

    int insert(OmsOrder record);

    int insertOrUpdate(OmsOrder record);

    int insertOrUpdateSelective(OmsOrder record);

    int insertSelective(OmsOrder record);

    OmsOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrder record);

    int updateByPrimaryKey(OmsOrder record);

    int updateBatch(List<OmsOrder> list);

    int batchInsert(List<OmsOrder> list);

}
