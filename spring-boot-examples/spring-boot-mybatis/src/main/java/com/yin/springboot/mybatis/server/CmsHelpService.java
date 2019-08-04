package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.CmsHelp;
public interface CmsHelpService{


    int deleteByPrimaryKey(Long id);

    int insert(CmsHelp record);

    int insertOrUpdate(CmsHelp record);

    int insertOrUpdateSelective(CmsHelp record);

    int insertSelective(CmsHelp record);

    CmsHelp selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsHelp record);

    int updateByPrimaryKey(CmsHelp record);

    int updateBatch(List<CmsHelp> list);

    int batchInsert(List<CmsHelp> list);

}
