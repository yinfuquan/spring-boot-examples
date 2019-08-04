package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.CmsPrefrenceArea;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsPrefrenceAreaMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsPrefrenceArea record);

    int insertOrUpdate(CmsPrefrenceArea record);

    int insertOrUpdateSelective(CmsPrefrenceArea record);

    int insertSelective(CmsPrefrenceArea record);

    CmsPrefrenceArea selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsPrefrenceArea record);

    int updateByPrimaryKey(CmsPrefrenceArea record);

    int updateBatch(List<CmsPrefrenceArea> list);

    int batchInsert(@Param("list") List<CmsPrefrenceArea> list);
}