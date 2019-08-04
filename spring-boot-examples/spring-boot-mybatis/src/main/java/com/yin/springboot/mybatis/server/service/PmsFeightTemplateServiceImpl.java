package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.PmsFeightTemplate;
import com.yin.springboot.mybatis.mapper.PmsFeightTemplateMapper;
import com.yin.springboot.mybatis.server.PmsFeightTemplateService;
@Service
public class PmsFeightTemplateServiceImpl implements PmsFeightTemplateService{

    @Resource
    private PmsFeightTemplateMapper pmsFeightTemplateMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsFeightTemplateMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsFeightTemplate record) {
        return pmsFeightTemplateMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PmsFeightTemplate record) {
        return pmsFeightTemplateMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PmsFeightTemplate record) {
        return pmsFeightTemplateMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PmsFeightTemplate record) {
        return pmsFeightTemplateMapper.insertSelective(record);
    }

    @Override
    public PmsFeightTemplate selectByPrimaryKey(Long id) {
        return pmsFeightTemplateMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsFeightTemplate record) {
        return pmsFeightTemplateMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsFeightTemplate record) {
        return pmsFeightTemplateMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PmsFeightTemplate> list) {
        return pmsFeightTemplateMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PmsFeightTemplate> list) {
        return pmsFeightTemplateMapper.batchInsert(list);
    }

}
