package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.CmsHelpCategory;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsHelpCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsHelpCategory record);

    int insertOrUpdate(CmsHelpCategory record);

    int insertOrUpdateSelective(CmsHelpCategory record);

    int insertSelective(CmsHelpCategory record);

    CmsHelpCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsHelpCategory record);

    int updateByPrimaryKey(CmsHelpCategory record);

    int updateBatch(List<CmsHelpCategory> list);

    int batchInsert(@Param("list") List<CmsHelpCategory> list);
}