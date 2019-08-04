package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.PmsProductAttribute;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductAttributeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttribute record);

    int insertOrUpdate(PmsProductAttribute record);

    int insertOrUpdateSelective(PmsProductAttribute record);

    int insertSelective(PmsProductAttribute record);

    PmsProductAttribute selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductAttribute record);

    int updateByPrimaryKey(PmsProductAttribute record);

    int updateBatch(List<PmsProductAttribute> list);

    int batchInsert(@Param("list") List<PmsProductAttribute> list);
}