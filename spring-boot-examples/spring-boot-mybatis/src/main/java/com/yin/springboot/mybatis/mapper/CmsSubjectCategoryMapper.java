package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.CmsSubjectCategory;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsSubjectCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsSubjectCategory record);

    int insertOrUpdate(CmsSubjectCategory record);

    int insertOrUpdateSelective(CmsSubjectCategory record);

    int insertSelective(CmsSubjectCategory record);

    CmsSubjectCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsSubjectCategory record);

    int updateByPrimaryKey(CmsSubjectCategory record);

    int updateBatch(List<CmsSubjectCategory> list);

    int batchInsert(@Param("list") List<CmsSubjectCategory> list);
}