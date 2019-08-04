package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.PmsProductCategory;
import com.yin.springboot.mybatis.mapper.PmsProductCategoryMapper;
import com.yin.springboot.mybatis.server.PmsProductCategoryService;
@Service
public class PmsProductCategoryServiceImpl implements PmsProductCategoryService{

    @Resource
    private PmsProductCategoryMapper pmsProductCategoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsProductCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsProductCategory record) {
        return pmsProductCategoryMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PmsProductCategory record) {
        return pmsProductCategoryMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PmsProductCategory record) {
        return pmsProductCategoryMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PmsProductCategory record) {
        return pmsProductCategoryMapper.insertSelective(record);
    }

    @Override
    public PmsProductCategory selectByPrimaryKey(Long id) {
        return pmsProductCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsProductCategory record) {
        return pmsProductCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsProductCategory record) {
        return pmsProductCategoryMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PmsProductCategory> list) {
        return pmsProductCategoryMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PmsProductCategory> list) {
        return pmsProductCategoryMapper.batchInsert(list);
    }

}
