package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.UmsMemberRuleSetting;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberRuleSettingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberRuleSetting record);

    int insertOrUpdate(UmsMemberRuleSetting record);

    int insertOrUpdateSelective(UmsMemberRuleSetting record);

    int insertSelective(UmsMemberRuleSetting record);

    UmsMemberRuleSetting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberRuleSetting record);

    int updateByPrimaryKey(UmsMemberRuleSetting record);

    int updateBatch(List<UmsMemberRuleSetting> list);

    int batchInsert(@Param("list") List<UmsMemberRuleSetting> list);
}