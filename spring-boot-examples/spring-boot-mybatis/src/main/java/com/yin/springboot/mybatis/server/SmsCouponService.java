package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.SmsCoupon;
public interface SmsCouponService{


    int deleteByPrimaryKey(Long id);

    int insert(SmsCoupon record);

    int insertOrUpdate(SmsCoupon record);

    int insertOrUpdateSelective(SmsCoupon record);

    int insertSelective(SmsCoupon record);

    SmsCoupon selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsCoupon record);

    int updateByPrimaryKey(SmsCoupon record);

    int updateBatch(List<SmsCoupon> list);

    int batchInsert(List<SmsCoupon> list);

}
