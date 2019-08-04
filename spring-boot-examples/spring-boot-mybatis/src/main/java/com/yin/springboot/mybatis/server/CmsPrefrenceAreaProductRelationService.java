package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.CmsPrefrenceAreaProductRelation;
public interface CmsPrefrenceAreaProductRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(CmsPrefrenceAreaProductRelation record);

    int insertOrUpdate(CmsPrefrenceAreaProductRelation record);

    int insertOrUpdateSelective(CmsPrefrenceAreaProductRelation record);

    int insertSelective(CmsPrefrenceAreaProductRelation record);

    CmsPrefrenceAreaProductRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsPrefrenceAreaProductRelation record);

    int updateByPrimaryKey(CmsPrefrenceAreaProductRelation record);

    int updateBatch(List<CmsPrefrenceAreaProductRelation> list);

    int batchInsert(List<CmsPrefrenceAreaProductRelation> list);

}
