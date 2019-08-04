package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.CmsTopic;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsTopicMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsTopic record);

    int insertOrUpdate(CmsTopic record);

    int insertOrUpdateSelective(CmsTopic record);

    int insertSelective(CmsTopic record);

    CmsTopic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsTopic record);

    int updateByPrimaryKey(CmsTopic record);

    int updateBatch(List<CmsTopic> list);

    int batchInsert(@Param("list") List<CmsTopic> list);
}