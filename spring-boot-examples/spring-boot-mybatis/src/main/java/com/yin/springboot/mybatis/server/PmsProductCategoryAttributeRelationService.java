package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.PmsProductCategoryAttributeRelation;
public interface PmsProductCategoryAttributeRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsProductCategoryAttributeRelation record);

    int insertOrUpdate(PmsProductCategoryAttributeRelation record);

    int insertOrUpdateSelective(PmsProductCategoryAttributeRelation record);

    int insertSelective(PmsProductCategoryAttributeRelation record);

    PmsProductCategoryAttributeRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductCategoryAttributeRelation record);

    int updateByPrimaryKey(PmsProductCategoryAttributeRelation record);

    int updateBatch(List<PmsProductCategoryAttributeRelation> list);

    int batchInsert(List<PmsProductCategoryAttributeRelation> list);

}
