package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.SmsHomeBrand;
public interface SmsHomeBrandService{


    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeBrand record);

    int insertOrUpdate(SmsHomeBrand record);

    int insertOrUpdateSelective(SmsHomeBrand record);

    int insertSelective(SmsHomeBrand record);

    SmsHomeBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeBrand record);

    int updateByPrimaryKey(SmsHomeBrand record);

    int updateBatch(List<SmsHomeBrand> list);

    int batchInsert(List<SmsHomeBrand> list);

}
