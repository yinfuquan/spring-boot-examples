package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.UmsMemberRuleSetting;
public interface UmsMemberRuleSettingService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberRuleSetting record);

    int insertOrUpdate(UmsMemberRuleSetting record);

    int insertOrUpdateSelective(UmsMemberRuleSetting record);

    int insertSelective(UmsMemberRuleSetting record);

    UmsMemberRuleSetting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberRuleSetting record);

    int updateByPrimaryKey(UmsMemberRuleSetting record);

    int updateBatch(List<UmsMemberRuleSetting> list);

    int batchInsert(List<UmsMemberRuleSetting> list);

}
