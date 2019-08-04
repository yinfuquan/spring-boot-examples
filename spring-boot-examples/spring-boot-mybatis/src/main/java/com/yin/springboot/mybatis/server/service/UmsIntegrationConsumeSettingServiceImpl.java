package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.UmsIntegrationConsumeSetting;
import com.yin.springboot.mybatis.mapper.UmsIntegrationConsumeSettingMapper;
import com.yin.springboot.mybatis.server.UmsIntegrationConsumeSettingService;
@Service
public class UmsIntegrationConsumeSettingServiceImpl implements UmsIntegrationConsumeSettingService{

    @Resource
    private UmsIntegrationConsumeSettingMapper umsIntegrationConsumeSettingMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsIntegrationConsumeSettingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsIntegrationConsumeSetting record) {
        return umsIntegrationConsumeSettingMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(UmsIntegrationConsumeSetting record) {
        return umsIntegrationConsumeSettingMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UmsIntegrationConsumeSetting record) {
        return umsIntegrationConsumeSettingMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(UmsIntegrationConsumeSetting record) {
        return umsIntegrationConsumeSettingMapper.insertSelective(record);
    }

    @Override
    public UmsIntegrationConsumeSetting selectByPrimaryKey(Long id) {
        return umsIntegrationConsumeSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsIntegrationConsumeSetting record) {
        return umsIntegrationConsumeSettingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsIntegrationConsumeSetting record) {
        return umsIntegrationConsumeSettingMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<UmsIntegrationConsumeSetting> list) {
        return umsIntegrationConsumeSettingMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<UmsIntegrationConsumeSetting> list) {
        return umsIntegrationConsumeSettingMapper.batchInsert(list);
    }

}
