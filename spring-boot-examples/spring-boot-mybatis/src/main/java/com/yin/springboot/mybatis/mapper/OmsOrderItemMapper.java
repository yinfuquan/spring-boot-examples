package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.OmsOrderItem;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderItem record);

    int insertOrUpdate(OmsOrderItem record);

    int insertOrUpdateSelective(OmsOrderItem record);

    int insertSelective(OmsOrderItem record);

    OmsOrderItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderItem record);

    int updateByPrimaryKey(OmsOrderItem record);

    int updateBatch(List<OmsOrderItem> list);

    int batchInsert(@Param("list") List<OmsOrderItem> list);
}