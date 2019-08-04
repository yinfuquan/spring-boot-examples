package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.PmsProduct;
public interface PmsProductService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsProduct record);

    int insertOrUpdate(PmsProduct record);

    int insertOrUpdateSelective(PmsProduct record);

    int insertSelective(PmsProduct record);

    PmsProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProduct record);

    int updateByPrimaryKey(PmsProduct record);

    int updateBatch(List<PmsProduct> list);

    int batchInsert(List<PmsProduct> list);

}
