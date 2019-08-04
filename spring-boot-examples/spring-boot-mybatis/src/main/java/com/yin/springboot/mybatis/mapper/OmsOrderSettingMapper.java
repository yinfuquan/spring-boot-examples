package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.OmsOrderSetting;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderSettingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderSetting record);

    int insertOrUpdate(OmsOrderSetting record);

    int insertOrUpdateSelective(OmsOrderSetting record);

    int insertSelective(OmsOrderSetting record);

    OmsOrderSetting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderSetting record);

    int updateByPrimaryKey(OmsOrderSetting record);

    int updateBatch(List<OmsOrderSetting> list);

    int batchInsert(@Param("list") List<OmsOrderSetting> list);
}