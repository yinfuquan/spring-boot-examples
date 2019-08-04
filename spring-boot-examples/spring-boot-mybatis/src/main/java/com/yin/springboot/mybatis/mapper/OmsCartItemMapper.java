package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.OmsCartItem;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsCartItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsCartItem record);

    int insertOrUpdate(OmsCartItem record);

    int insertOrUpdateSelective(OmsCartItem record);

    int insertSelective(OmsCartItem record);

    OmsCartItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsCartItem record);

    int updateByPrimaryKey(OmsCartItem record);

    int updateBatch(List<OmsCartItem> list);

    int batchInsert(@Param("list") List<OmsCartItem> list);
}