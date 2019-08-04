package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.PmsProductAttributeValue;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductAttributeValueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttributeValue record);

    int insertOrUpdate(PmsProductAttributeValue record);

    int insertOrUpdateSelective(PmsProductAttributeValue record);

    int insertSelective(PmsProductAttributeValue record);

    PmsProductAttributeValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductAttributeValue record);

    int updateByPrimaryKey(PmsProductAttributeValue record);

    int updateBatch(List<PmsProductAttributeValue> list);

    int batchInsert(@Param("list") List<PmsProductAttributeValue> list);
}