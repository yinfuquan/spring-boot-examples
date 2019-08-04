package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.OmsOrderSetting;
public interface OmsOrderSettingService{


    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderSetting record);

    int insertOrUpdate(OmsOrderSetting record);

    int insertOrUpdateSelective(OmsOrderSetting record);

    int insertSelective(OmsOrderSetting record);

    OmsOrderSetting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderSetting record);

    int updateByPrimaryKey(OmsOrderSetting record);

    int updateBatch(List<OmsOrderSetting> list);

    int batchInsert(List<OmsOrderSetting> list);

}
