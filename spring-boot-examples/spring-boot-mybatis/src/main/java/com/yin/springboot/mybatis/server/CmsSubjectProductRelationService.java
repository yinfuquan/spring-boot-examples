package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.CmsSubjectProductRelation;
public interface CmsSubjectProductRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(CmsSubjectProductRelation record);

    int insertOrUpdate(CmsSubjectProductRelation record);

    int insertOrUpdateSelective(CmsSubjectProductRelation record);

    int insertSelective(CmsSubjectProductRelation record);

    CmsSubjectProductRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsSubjectProductRelation record);

    int updateByPrimaryKey(CmsSubjectProductRelation record);

    int updateBatch(List<CmsSubjectProductRelation> list);

    int batchInsert(List<CmsSubjectProductRelation> list);

}
