package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.CmsSubjectComment;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsSubjectCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsSubjectComment record);

    int insertOrUpdate(CmsSubjectComment record);

    int insertOrUpdateSelective(CmsSubjectComment record);

    int insertSelective(CmsSubjectComment record);

    CmsSubjectComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsSubjectComment record);

    int updateByPrimaryKey(CmsSubjectComment record);

    int updateBatch(List<CmsSubjectComment> list);

    int batchInsert(@Param("list") List<CmsSubjectComment> list);
}