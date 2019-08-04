package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.OmsOrderSettingMapper;
import com.yin.springboot.mybatis.domain.OmsOrderSetting;
import com.yin.springboot.mybatis.server.OmsOrderSettingService;
@Service
public class OmsOrderSettingServiceImpl implements OmsOrderSettingService{

    @Resource
    private OmsOrderSettingMapper omsOrderSettingMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return omsOrderSettingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OmsOrderSetting record) {
        return omsOrderSettingMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(OmsOrderSetting record) {
        return omsOrderSettingMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(OmsOrderSetting record) {
        return omsOrderSettingMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(OmsOrderSetting record) {
        return omsOrderSettingMapper.insertSelective(record);
    }

    @Override
    public OmsOrderSetting selectByPrimaryKey(Long id) {
        return omsOrderSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OmsOrderSetting record) {
        return omsOrderSettingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OmsOrderSetting record) {
        return omsOrderSettingMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<OmsOrderSetting> list) {
        return omsOrderSettingMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<OmsOrderSetting> list) {
        return omsOrderSettingMapper.batchInsert(list);
    }

}
