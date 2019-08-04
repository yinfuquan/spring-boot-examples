package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.CmsTopicComment;
public interface CmsTopicCommentService{


    int deleteByPrimaryKey(Long id);

    int insert(CmsTopicComment record);

    int insertOrUpdate(CmsTopicComment record);

    int insertOrUpdateSelective(CmsTopicComment record);

    int insertSelective(CmsTopicComment record);

    CmsTopicComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsTopicComment record);

    int updateByPrimaryKey(CmsTopicComment record);

    int updateBatch(List<CmsTopicComment> list);

    int batchInsert(List<CmsTopicComment> list);

}
