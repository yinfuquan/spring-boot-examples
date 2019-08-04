package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.CmsHelp;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsHelpMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsHelp record);

    int insertOrUpdate(CmsHelp record);

    int insertOrUpdateSelective(CmsHelp record);

    int insertSelective(CmsHelp record);

    CmsHelp selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsHelp record);

    int updateByPrimaryKey(CmsHelp record);

    int updateBatch(List<CmsHelp> list);

    int batchInsert(@Param("list") List<CmsHelp> list);
}