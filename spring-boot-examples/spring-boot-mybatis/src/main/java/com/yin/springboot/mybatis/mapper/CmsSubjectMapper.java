package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.CmsSubject;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsSubjectMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsSubject record);

    int insertOrUpdate(CmsSubject record);

    int insertOrUpdateSelective(CmsSubject record);

    int insertSelective(CmsSubject record);

    CmsSubject selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsSubject record);

    int updateByPrimaryKey(CmsSubject record);

    int updateBatch(List<CmsSubject> list);

    int batchInsert(@Param("list") List<CmsSubject> list);
}