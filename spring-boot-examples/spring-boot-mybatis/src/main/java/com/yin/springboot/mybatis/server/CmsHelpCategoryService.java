package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.CmsHelpCategory;
public interface CmsHelpCategoryService{


    int deleteByPrimaryKey(Long id);

    int insert(CmsHelpCategory record);

    int insertOrUpdate(CmsHelpCategory record);

    int insertOrUpdateSelective(CmsHelpCategory record);

    int insertSelective(CmsHelpCategory record);

    CmsHelpCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsHelpCategory record);

    int updateByPrimaryKey(CmsHelpCategory record);

    int updateBatch(List<CmsHelpCategory> list);

    int batchInsert(List<CmsHelpCategory> list);

}
