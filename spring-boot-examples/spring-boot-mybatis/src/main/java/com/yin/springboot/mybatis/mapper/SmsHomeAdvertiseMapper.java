package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.SmsHomeAdvertise;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsHomeAdvertiseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeAdvertise record);

    int insertOrUpdate(SmsHomeAdvertise record);

    int insertOrUpdateSelective(SmsHomeAdvertise record);

    int insertSelective(SmsHomeAdvertise record);

    SmsHomeAdvertise selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeAdvertise record);

    int updateByPrimaryKey(SmsHomeAdvertise record);

    int updateBatch(List<SmsHomeAdvertise> list);

    int batchInsert(@Param("list") List<SmsHomeAdvertise> list);
}