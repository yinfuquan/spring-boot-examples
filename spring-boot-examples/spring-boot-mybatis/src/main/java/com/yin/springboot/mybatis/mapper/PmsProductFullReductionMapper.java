package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.PmsProductFullReduction;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductFullReductionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductFullReduction record);

    int insertOrUpdate(PmsProductFullReduction record);

    int insertOrUpdateSelective(PmsProductFullReduction record);

    int insertSelective(PmsProductFullReduction record);

    PmsProductFullReduction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductFullReduction record);

    int updateByPrimaryKey(PmsProductFullReduction record);

    int updateBatch(List<PmsProductFullReduction> list);

    int batchInsert(@Param("list") List<PmsProductFullReduction> list);
}