package com.yin.springboot.mybatis.server;

import com.yin.springboot.mybatis.domain.SmsCouponProductCategoryRelation;
import java.util.List;
public interface SmsCouponProductCategoryRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponProductCategoryRelation record);

    int insertOrUpdate(SmsCouponProductCategoryRelation record);

    int insertOrUpdateSelective(SmsCouponProductCategoryRelation record);

    int insertSelective(SmsCouponProductCategoryRelation record);

    SmsCouponProductCategoryRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsCouponProductCategoryRelation record);

    int updateByPrimaryKey(SmsCouponProductCategoryRelation record);

    int updateBatch(List<SmsCouponProductCategoryRelation> list);

    int batchInsert(List<SmsCouponProductCategoryRelation> list);

}
