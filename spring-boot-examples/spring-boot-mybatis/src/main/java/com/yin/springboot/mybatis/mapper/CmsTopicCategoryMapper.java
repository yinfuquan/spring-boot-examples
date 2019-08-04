package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.CmsTopicCategory;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsTopicCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsTopicCategory record);

    int insertOrUpdate(CmsTopicCategory record);

    int insertOrUpdateSelective(CmsTopicCategory record);

    int insertSelective(CmsTopicCategory record);

    CmsTopicCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsTopicCategory record);

    int updateByPrimaryKey(CmsTopicCategory record);

    int updateBatch(List<CmsTopicCategory> list);

    int batchInsert(@Param("list") List<CmsTopicCategory> list);
}