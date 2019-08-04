package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.PmsFeightTemplate;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsFeightTemplateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsFeightTemplate record);

    int insertOrUpdate(PmsFeightTemplate record);

    int insertOrUpdateSelective(PmsFeightTemplate record);

    int insertSelective(PmsFeightTemplate record);

    PmsFeightTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsFeightTemplate record);

    int updateByPrimaryKey(PmsFeightTemplate record);

    int updateBatch(List<PmsFeightTemplate> list);

    int batchInsert(@Param("list") List<PmsFeightTemplate> list);
}