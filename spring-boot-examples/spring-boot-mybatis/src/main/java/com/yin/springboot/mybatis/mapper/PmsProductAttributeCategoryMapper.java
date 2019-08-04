package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.PmsProductAttributeCategory;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductAttributeCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttributeCategory record);

    int insertOrUpdate(PmsProductAttributeCategory record);

    int insertOrUpdateSelective(PmsProductAttributeCategory record);

    int insertSelective(PmsProductAttributeCategory record);

    PmsProductAttributeCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductAttributeCategory record);

    int updateByPrimaryKey(PmsProductAttributeCategory record);

    int updateBatch(List<PmsProductAttributeCategory> list);

    int batchInsert(@Param("list") List<PmsProductAttributeCategory> list);
}