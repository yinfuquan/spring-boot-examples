package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.SmsHomeNewProduct;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsHomeNewProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeNewProduct record);

    int insertOrUpdate(SmsHomeNewProduct record);

    int insertOrUpdateSelective(SmsHomeNewProduct record);

    int insertSelective(SmsHomeNewProduct record);

    SmsHomeNewProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeNewProduct record);

    int updateByPrimaryKey(SmsHomeNewProduct record);

    int updateBatch(List<SmsHomeNewProduct> list);

    int batchInsert(@Param("list") List<SmsHomeNewProduct> list);
}