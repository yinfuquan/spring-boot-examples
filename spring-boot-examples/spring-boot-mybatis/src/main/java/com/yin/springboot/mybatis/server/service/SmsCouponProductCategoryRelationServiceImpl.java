package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yin.springboot.mybatis.domain.SmsCouponProductCategoryRelation;
import java.util.List;
import com.yin.springboot.mybatis.mapper.SmsCouponProductCategoryRelationMapper;
import com.yin.springboot.mybatis.server.SmsCouponProductCategoryRelationService;
@Service
public class SmsCouponProductCategoryRelationServiceImpl implements SmsCouponProductCategoryRelationService{

    @Resource
    private SmsCouponProductCategoryRelationMapper smsCouponProductCategoryRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return smsCouponProductCategoryRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsCouponProductCategoryRelation record) {
        return smsCouponProductCategoryRelationMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(SmsCouponProductCategoryRelation record) {
        return smsCouponProductCategoryRelationMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SmsCouponProductCategoryRelation record) {
        return smsCouponProductCategoryRelationMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(SmsCouponProductCategoryRelation record) {
        return smsCouponProductCategoryRelationMapper.insertSelective(record);
    }

    @Override
    public SmsCouponProductCategoryRelation selectByPrimaryKey(Long id) {
        return smsCouponProductCategoryRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsCouponProductCategoryRelation record) {
        return smsCouponProductCategoryRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsCouponProductCategoryRelation record) {
        return smsCouponProductCategoryRelationMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<SmsCouponProductCategoryRelation> list) {
        return smsCouponProductCategoryRelationMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<SmsCouponProductCategoryRelation> list) {
        return smsCouponProductCategoryRelationMapper.batchInsert(list);
    }

}
