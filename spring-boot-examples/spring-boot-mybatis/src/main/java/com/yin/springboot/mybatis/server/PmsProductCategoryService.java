package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.PmsProductCategory;
public interface PmsProductCategoryService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsProductCategory record);

    int insertOrUpdate(PmsProductCategory record);

    int insertOrUpdateSelective(PmsProductCategory record);

    int insertSelective(PmsProductCategory record);

    PmsProductCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductCategory record);

    int updateByPrimaryKey(PmsProductCategory record);

    int updateBatch(List<PmsProductCategory> list);

    int batchInsert(List<PmsProductCategory> list);

}
