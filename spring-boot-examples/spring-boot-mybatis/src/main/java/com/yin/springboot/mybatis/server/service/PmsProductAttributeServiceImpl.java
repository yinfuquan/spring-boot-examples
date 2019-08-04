package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.PmsProductAttribute;
import com.yin.springboot.mybatis.mapper.PmsProductAttributeMapper;
import com.yin.springboot.mybatis.server.PmsProductAttributeService;
@Service
public class PmsProductAttributeServiceImpl implements PmsProductAttributeService{

    @Resource
    private PmsProductAttributeMapper pmsProductAttributeMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsProductAttributeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsProductAttribute record) {
        return pmsProductAttributeMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PmsProductAttribute record) {
        return pmsProductAttributeMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PmsProductAttribute record) {
        return pmsProductAttributeMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PmsProductAttribute record) {
        return pmsProductAttributeMapper.insertSelective(record);
    }

    @Override
    public PmsProductAttribute selectByPrimaryKey(Long id) {
        return pmsProductAttributeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsProductAttribute record) {
        return pmsProductAttributeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsProductAttribute record) {
        return pmsProductAttributeMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PmsProductAttribute> list) {
        return pmsProductAttributeMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PmsProductAttribute> list) {
        return pmsProductAttributeMapper.batchInsert(list);
    }

}
