package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.CmsTopicCategory;
public interface CmsTopicCategoryService{


    int deleteByPrimaryKey(Long id);

    int insert(CmsTopicCategory record);

    int insertOrUpdate(CmsTopicCategory record);

    int insertOrUpdateSelective(CmsTopicCategory record);

    int insertSelective(CmsTopicCategory record);

    CmsTopicCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsTopicCategory record);

    int updateByPrimaryKey(CmsTopicCategory record);

    int updateBatch(List<CmsTopicCategory> list);

    int batchInsert(List<CmsTopicCategory> list);

}
