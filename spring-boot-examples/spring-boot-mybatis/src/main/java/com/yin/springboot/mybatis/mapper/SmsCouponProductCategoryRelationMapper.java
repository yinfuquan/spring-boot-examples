package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.SmsCouponProductCategoryRelation;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsCouponProductCategoryRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponProductCategoryRelation record);

    int insertOrUpdate(SmsCouponProductCategoryRelation record);

    int insertOrUpdateSelective(SmsCouponProductCategoryRelation record);

    int insertSelective(SmsCouponProductCategoryRelation record);

    SmsCouponProductCategoryRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsCouponProductCategoryRelation record);

    int updateByPrimaryKey(SmsCouponProductCategoryRelation record);

    int updateBatch(List<SmsCouponProductCategoryRelation> list);

    int batchInsert(@Param("list") List<SmsCouponProductCategoryRelation> list);
}