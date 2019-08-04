package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.CmsTopic;
public interface CmsTopicService{


    int deleteByPrimaryKey(Long id);

    int insert(CmsTopic record);

    int insertOrUpdate(CmsTopic record);

    int insertOrUpdateSelective(CmsTopic record);

    int insertSelective(CmsTopic record);

    CmsTopic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsTopic record);

    int updateByPrimaryKey(CmsTopic record);

    int updateBatch(List<CmsTopic> list);

    int batchInsert(List<CmsTopic> list);

}
