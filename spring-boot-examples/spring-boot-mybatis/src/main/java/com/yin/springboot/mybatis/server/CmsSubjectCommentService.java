package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.CmsSubjectComment;
public interface CmsSubjectCommentService{


    int deleteByPrimaryKey(Long id);

    int insert(CmsSubjectComment record);

    int insertOrUpdate(CmsSubjectComment record);

    int insertOrUpdateSelective(CmsSubjectComment record);

    int insertSelective(CmsSubjectComment record);

    CmsSubjectComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsSubjectComment record);

    int updateByPrimaryKey(CmsSubjectComment record);

    int updateBatch(List<CmsSubjectComment> list);

    int batchInsert(List<CmsSubjectComment> list);

}
