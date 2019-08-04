package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.SmsCouponProductRelationMapper;
import com.yin.springboot.mybatis.domain.SmsCouponProductRelation;
import com.yin.springboot.mybatis.server.SmsCouponProductRelationService;
@Service
public class SmsCouponProductRelationServiceImpl implements SmsCouponProductRelationService{

    @Resource
    private SmsCouponProductRelationMapper smsCouponProductRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return smsCouponProductRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsCouponProductRelation record) {
        return smsCouponProductRelationMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(SmsCouponProductRelation record) {
        return smsCouponProductRelationMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SmsCouponProductRelation record) {
        return smsCouponProductRelationMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(SmsCouponProductRelation record) {
        return smsCouponProductRelationMapper.insertSelective(record);
    }

    @Override
    public SmsCouponProductRelation selectByPrimaryKey(Long id) {
        return smsCouponProductRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsCouponProductRelation record) {
        return smsCouponProductRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsCouponProductRelation record) {
        return smsCouponProductRelationMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<SmsCouponProductRelation> list) {
        return smsCouponProductRelationMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<SmsCouponProductRelation> list) {
        return smsCouponProductRelationMapper.batchInsert(list);
    }

}
