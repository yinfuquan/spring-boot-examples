package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.PmsProductAttributeCategory;
import com.yin.springboot.mybatis.mapper.PmsProductAttributeCategoryMapper;
import com.yin.springboot.mybatis.server.PmsProductAttributeCategoryService;
@Service
public class PmsProductAttributeCategoryServiceImpl implements PmsProductAttributeCategoryService{

    @Resource
    private PmsProductAttributeCategoryMapper pmsProductAttributeCategoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsProductAttributeCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsProductAttributeCategory record) {
        return pmsProductAttributeCategoryMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PmsProductAttributeCategory record) {
        return pmsProductAttributeCategoryMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PmsProductAttributeCategory record) {
        return pmsProductAttributeCategoryMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PmsProductAttributeCategory record) {
        return pmsProductAttributeCategoryMapper.insertSelective(record);
    }

    @Override
    public PmsProductAttributeCategory selectByPrimaryKey(Long id) {
        return pmsProductAttributeCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsProductAttributeCategory record) {
        return pmsProductAttributeCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsProductAttributeCategory record) {
        return pmsProductAttributeCategoryMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PmsProductAttributeCategory> list) {
        return pmsProductAttributeCategoryMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PmsProductAttributeCategory> list) {
        return pmsProductAttributeCategoryMapper.batchInsert(list);
    }

}
