package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.CmsSubject;
public interface CmsSubjectService{


    int deleteByPrimaryKey(Long id);

    int insert(CmsSubject record);

    int insertOrUpdate(CmsSubject record);

    int insertOrUpdateSelective(CmsSubject record);

    int insertSelective(CmsSubject record);

    CmsSubject selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsSubject record);

    int updateByPrimaryKey(CmsSubject record);

    int updateBatch(List<CmsSubject> list);

    int batchInsert(List<CmsSubject> list);

}
