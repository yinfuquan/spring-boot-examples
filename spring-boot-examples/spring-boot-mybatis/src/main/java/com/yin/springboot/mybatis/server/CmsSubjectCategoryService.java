package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.CmsSubjectCategory;
public interface CmsSubjectCategoryService{


    int deleteByPrimaryKey(Long id);

    int insert(CmsSubjectCategory record);

    int insertOrUpdate(CmsSubjectCategory record);

    int insertOrUpdateSelective(CmsSubjectCategory record);

    int insertSelective(CmsSubjectCategory record);

    CmsSubjectCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsSubjectCategory record);

    int updateByPrimaryKey(CmsSubjectCategory record);

    int updateBatch(List<CmsSubjectCategory> list);

    int batchInsert(List<CmsSubjectCategory> list);

}
