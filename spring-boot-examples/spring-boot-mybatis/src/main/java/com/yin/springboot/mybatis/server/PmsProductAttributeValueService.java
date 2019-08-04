package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.PmsProductAttributeValue;
public interface PmsProductAttributeValueService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttributeValue record);

    int insertOrUpdate(PmsProductAttributeValue record);

    int insertOrUpdateSelective(PmsProductAttributeValue record);

    int insertSelective(PmsProductAttributeValue record);

    PmsProductAttributeValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductAttributeValue record);

    int updateByPrimaryKey(PmsProductAttributeValue record);

    int updateBatch(List<PmsProductAttributeValue> list);

    int batchInsert(List<PmsProductAttributeValue> list);

}
