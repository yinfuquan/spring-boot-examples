package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.SmsCoupon;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsCouponMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsCoupon record);

    int insertOrUpdate(SmsCoupon record);

    int insertOrUpdateSelective(SmsCoupon record);

    int insertSelective(SmsCoupon record);

    SmsCoupon selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsCoupon record);

    int updateByPrimaryKey(SmsCoupon record);

    int updateBatch(List<SmsCoupon> list);

    int batchInsert(@Param("list") List<SmsCoupon> list);
}