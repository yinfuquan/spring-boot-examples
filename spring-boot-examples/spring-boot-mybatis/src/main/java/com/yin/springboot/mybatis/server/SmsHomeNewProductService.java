package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.SmsHomeNewProduct;
public interface SmsHomeNewProductService{


    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeNewProduct record);

    int insertOrUpdate(SmsHomeNewProduct record);

    int insertOrUpdateSelective(SmsHomeNewProduct record);

    int insertSelective(SmsHomeNewProduct record);

    SmsHomeNewProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeNewProduct record);

    int updateByPrimaryKey(SmsHomeNewProduct record);

    int updateBatch(List<SmsHomeNewProduct> list);

    int batchInsert(List<SmsHomeNewProduct> list);

}
