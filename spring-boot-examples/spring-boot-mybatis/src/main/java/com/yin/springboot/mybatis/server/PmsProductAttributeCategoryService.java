package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.PmsProductAttributeCategory;
public interface PmsProductAttributeCategoryService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttributeCategory record);

    int insertOrUpdate(PmsProductAttributeCategory record);

    int insertOrUpdateSelective(PmsProductAttributeCategory record);

    int insertSelective(PmsProductAttributeCategory record);

    PmsProductAttributeCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductAttributeCategory record);

    int updateByPrimaryKey(PmsProductAttributeCategory record);

    int updateBatch(List<PmsProductAttributeCategory> list);

    int batchInsert(List<PmsProductAttributeCategory> list);

}
