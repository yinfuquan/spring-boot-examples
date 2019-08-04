package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.CmsSubjectProductRelation;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsSubjectProductRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsSubjectProductRelation record);

    int insertOrUpdate(CmsSubjectProductRelation record);

    int insertOrUpdateSelective(CmsSubjectProductRelation record);

    int insertSelective(CmsSubjectProductRelation record);

    CmsSubjectProductRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsSubjectProductRelation record);

    int updateByPrimaryKey(CmsSubjectProductRelation record);

    int updateBatch(List<CmsSubjectProductRelation> list);

    int batchInsert(@Param("list") List<CmsSubjectProductRelation> list);
}