package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.UmsMemberRuleSetting;
import com.yin.springboot.mybatis.mapper.UmsMemberRuleSettingMapper;
import com.yin.springboot.mybatis.server.UmsMemberRuleSettingService;
@Service
public class UmsMemberRuleSettingServiceImpl implements UmsMemberRuleSettingService{

    @Resource
    private UmsMemberRuleSettingMapper umsMemberRuleSettingMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsMemberRuleSettingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsMemberRuleSetting record) {
        return umsMemberRuleSettingMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(UmsMemberRuleSetting record) {
        return umsMemberRuleSettingMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UmsMemberRuleSetting record) {
        return umsMemberRuleSettingMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(UmsMemberRuleSetting record) {
        return umsMemberRuleSettingMapper.insertSelective(record);
    }

    @Override
    public UmsMemberRuleSetting selectByPrimaryKey(Long id) {
        return umsMemberRuleSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsMemberRuleSetting record) {
        return umsMemberRuleSettingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsMemberRuleSetting record) {
        return umsMemberRuleSettingMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<UmsMemberRuleSetting> list) {
        return umsMemberRuleSettingMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<UmsMemberRuleSetting> list) {
        return umsMemberRuleSettingMapper.batchInsert(list);
    }

}
