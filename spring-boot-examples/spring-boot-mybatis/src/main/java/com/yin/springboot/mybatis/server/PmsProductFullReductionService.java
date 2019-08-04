package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.PmsProductFullReduction;
public interface PmsProductFullReductionService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsProductFullReduction record);

    int insertOrUpdate(PmsProductFullReduction record);

    int insertOrUpdateSelective(PmsProductFullReduction record);

    int insertSelective(PmsProductFullReduction record);

    PmsProductFullReduction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductFullReduction record);

    int updateByPrimaryKey(PmsProductFullReduction record);

    int updateBatch(List<PmsProductFullReduction> list);

    int batchInsert(List<PmsProductFullReduction> list);

}
