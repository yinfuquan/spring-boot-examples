package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.PmsSkuStock;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsSkuStockMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsSkuStock record);

    int insertOrUpdate(PmsSkuStock record);

    int insertOrUpdateSelective(PmsSkuStock record);

    int insertSelective(PmsSkuStock record);

    PmsSkuStock selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsSkuStock record);

    int updateByPrimaryKey(PmsSkuStock record);

    int updateBatch(List<PmsSkuStock> list);

    int batchInsert(@Param("list") List<PmsSkuStock> list);
}