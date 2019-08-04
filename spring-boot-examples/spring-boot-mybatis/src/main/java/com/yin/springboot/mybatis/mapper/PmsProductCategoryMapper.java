package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.PmsProductCategory;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductCategory record);

    int insertOrUpdate(PmsProductCategory record);

    int insertOrUpdateSelective(PmsProductCategory record);

    int insertSelective(PmsProductCategory record);

    PmsProductCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductCategory record);

    int updateByPrimaryKey(PmsProductCategory record);

    int updateBatch(List<PmsProductCategory> list);

    int batchInsert(@Param("list") List<PmsProductCategory> list);
}