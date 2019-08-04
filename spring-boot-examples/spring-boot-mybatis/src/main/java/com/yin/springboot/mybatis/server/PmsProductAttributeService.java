package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.PmsProductAttribute;
public interface PmsProductAttributeService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttribute record);

    int insertOrUpdate(PmsProductAttribute record);

    int insertOrUpdateSelective(PmsProductAttribute record);

    int insertSelective(PmsProductAttribute record);

    PmsProductAttribute selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductAttribute record);

    int updateByPrimaryKey(PmsProductAttribute record);

    int updateBatch(List<PmsProductAttribute> list);

    int batchInsert(List<PmsProductAttribute> list);

}
