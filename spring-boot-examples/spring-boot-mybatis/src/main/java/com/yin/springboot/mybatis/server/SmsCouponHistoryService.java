package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.SmsCouponHistory;
public interface SmsCouponHistoryService{


    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponHistory record);

    int insertOrUpdate(SmsCouponHistory record);

    int insertOrUpdateSelective(SmsCouponHistory record);

    int insertSelective(SmsCouponHistory record);

    SmsCouponHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsCouponHistory record);

    int updateByPrimaryKey(SmsCouponHistory record);

    int updateBatch(List<SmsCouponHistory> list);

    int batchInsert(List<SmsCouponHistory> list);

}
