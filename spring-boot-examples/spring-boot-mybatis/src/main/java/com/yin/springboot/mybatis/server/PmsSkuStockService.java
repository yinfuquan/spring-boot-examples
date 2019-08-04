package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.PmsSkuStock;
public interface PmsSkuStockService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsSkuStock record);

    int insertOrUpdate(PmsSkuStock record);

    int insertOrUpdateSelective(PmsSkuStock record);

    int insertSelective(PmsSkuStock record);

    PmsSkuStock selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsSkuStock record);

    int updateByPrimaryKey(PmsSkuStock record);

    int updateBatch(List<PmsSkuStock> list);

    int batchInsert(List<PmsSkuStock> list);

}
