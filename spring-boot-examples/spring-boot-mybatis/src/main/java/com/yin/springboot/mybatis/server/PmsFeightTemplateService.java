package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.PmsFeightTemplate;
public interface PmsFeightTemplateService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsFeightTemplate record);

    int insertOrUpdate(PmsFeightTemplate record);

    int insertOrUpdateSelective(PmsFeightTemplate record);

    int insertSelective(PmsFeightTemplate record);

    PmsFeightTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsFeightTemplate record);

    int updateByPrimaryKey(PmsFeightTemplate record);

    int updateBatch(List<PmsFeightTemplate> list);

    int batchInsert(List<PmsFeightTemplate> list);

}
