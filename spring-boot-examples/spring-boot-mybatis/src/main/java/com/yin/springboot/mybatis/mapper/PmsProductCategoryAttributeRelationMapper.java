package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.PmsProductCategoryAttributeRelation;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductCategoryAttributeRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductCategoryAttributeRelation record);

    int insertOrUpdate(PmsProductCategoryAttributeRelation record);

    int insertOrUpdateSelective(PmsProductCategoryAttributeRelation record);

    int insertSelective(PmsProductCategoryAttributeRelation record);

    PmsProductCategoryAttributeRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductCategoryAttributeRelation record);

    int updateByPrimaryKey(PmsProductCategoryAttributeRelation record);

    int updateBatch(List<PmsProductCategoryAttributeRelation> list);

    int batchInsert(@Param("list") List<PmsProductCategoryAttributeRelation> list);
}