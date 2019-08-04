package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.CmsTopicComment;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsTopicCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsTopicComment record);

    int insertOrUpdate(CmsTopicComment record);

    int insertOrUpdateSelective(CmsTopicComment record);

    int insertSelective(CmsTopicComment record);

    CmsTopicComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsTopicComment record);

    int updateByPrimaryKey(CmsTopicComment record);

    int updateBatch(List<CmsTopicComment> list);

    int batchInsert(@Param("list") List<CmsTopicComment> list);
}