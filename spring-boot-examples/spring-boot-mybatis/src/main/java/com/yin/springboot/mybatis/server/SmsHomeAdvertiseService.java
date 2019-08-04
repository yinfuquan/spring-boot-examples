package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.SmsHomeAdvertise;
public interface SmsHomeAdvertiseService{


    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeAdvertise record);

    int insertOrUpdate(SmsHomeAdvertise record);

    int insertOrUpdateSelective(SmsHomeAdvertise record);

    int insertSelective(SmsHomeAdvertise record);

    SmsHomeAdvertise selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeAdvertise record);

    int updateByPrimaryKey(SmsHomeAdvertise record);

    int updateBatch(List<SmsHomeAdvertise> list);

    int batchInsert(List<SmsHomeAdvertise> list);

}
