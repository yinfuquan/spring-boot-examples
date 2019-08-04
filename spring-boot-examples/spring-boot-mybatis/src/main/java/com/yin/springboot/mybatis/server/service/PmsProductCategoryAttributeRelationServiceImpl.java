package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.PmsProductCategoryAttributeRelation;
import com.yin.springboot.mybatis.mapper.PmsProductCategoryAttributeRelationMapper;
import com.yin.springboot.mybatis.server.PmsProductCategoryAttributeRelationService;
@Service
public class PmsProductCategoryAttributeRelationServiceImpl implements PmsProductCategoryAttributeRelationService{

    @Resource
    private PmsProductCategoryAttributeRelationMapper pmsProductCategoryAttributeRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsProductCategoryAttributeRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsProductCategoryAttributeRelation record) {
        return pmsProductCategoryAttributeRelationMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PmsProductCategoryAttributeRelation record) {
        return pmsProductCategoryAttributeRelationMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PmsProductCategoryAttributeRelation record) {
        return pmsProductCategoryAttributeRelationMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PmsProductCategoryAttributeRelation record) {
        return pmsProductCategoryAttributeRelationMapper.insertSelective(record);
    }

    @Override
    public PmsProductCategoryAttributeRelation selectByPrimaryKey(Long id) {
        return pmsProductCategoryAttributeRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsProductCategoryAttributeRelation record) {
        return pmsProductCategoryAttributeRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsProductCategoryAttributeRelation record) {
        return pmsProductCategoryAttributeRelationMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PmsProductCategoryAttributeRelation> list) {
        return pmsProductCategoryAttributeRelationMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PmsProductCategoryAttributeRelation> list) {
        return pmsProductCategoryAttributeRelationMapper.batchInsert(list);
    }

}
