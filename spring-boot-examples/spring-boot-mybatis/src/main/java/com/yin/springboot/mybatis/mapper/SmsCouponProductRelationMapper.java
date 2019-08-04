package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.SmsCouponProductRelation;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsCouponProductRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponProductRelation record);

    int insertOrUpdate(SmsCouponProductRelation record);

    int insertOrUpdateSelective(SmsCouponProductRelation record);

    int insertSelective(SmsCouponProductRelation record);

    SmsCouponProductRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsCouponProductRelation record);

    int updateByPrimaryKey(SmsCouponProductRelation record);

    int updateBatch(List<SmsCouponProductRelation> list);

    int batchInsert(@Param("list") List<SmsCouponProductRelation> list);
}