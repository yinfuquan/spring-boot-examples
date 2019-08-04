package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.CmsPrefrenceAreaProductRelation;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsPrefrenceAreaProductRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsPrefrenceAreaProductRelation record);

    int insertOrUpdate(CmsPrefrenceAreaProductRelation record);

    int insertOrUpdateSelective(CmsPrefrenceAreaProductRelation record);

    int insertSelective(CmsPrefrenceAreaProductRelation record);

    CmsPrefrenceAreaProductRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsPrefrenceAreaProductRelation record);

    int updateByPrimaryKey(CmsPrefrenceAreaProductRelation record);

    int updateBatch(List<CmsPrefrenceAreaProductRelation> list);

    int batchInsert(@Param("list") List<CmsPrefrenceAreaProductRelation> list);
}