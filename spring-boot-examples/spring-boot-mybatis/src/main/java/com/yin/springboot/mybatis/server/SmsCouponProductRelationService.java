package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.SmsCouponProductRelation;
public interface SmsCouponProductRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponProductRelation record);

    int insertOrUpdate(SmsCouponProductRelation record);

    int insertOrUpdateSelective(SmsCouponProductRelation record);

    int insertSelective(SmsCouponProductRelation record);

    SmsCouponProductRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsCouponProductRelation record);

    int updateByPrimaryKey(SmsCouponProductRelation record);

    int updateBatch(List<SmsCouponProductRelation> list);

    int batchInsert(List<SmsCouponProductRelation> list);

}
