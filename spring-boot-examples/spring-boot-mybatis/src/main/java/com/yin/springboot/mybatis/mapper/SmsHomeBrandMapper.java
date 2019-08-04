package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.SmsHomeBrand;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsHomeBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeBrand record);

    int insertOrUpdate(SmsHomeBrand record);

    int insertOrUpdateSelective(SmsHomeBrand record);

    int insertSelective(SmsHomeBrand record);

    SmsHomeBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeBrand record);

    int updateByPrimaryKey(SmsHomeBrand record);

    int updateBatch(List<SmsHomeBrand> list);

    int batchInsert(@Param("list") List<SmsHomeBrand> list);
}