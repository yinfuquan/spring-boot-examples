package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.SmsFlashPromotionProductRelation;
import com.yin.springboot.mybatis.mapper.SmsFlashPromotionProductRelationMapper;
import com.yin.springboot.mybatis.server.SmsFlashPromotionProductRelationService;
@Service
public class SmsFlashPromotionProductRelationServiceImpl implements SmsFlashPromotionProductRelationService{

    @Resource
    private SmsFlashPromotionProductRelationMapper smsFlashPromotionProductRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return smsFlashPromotionProductRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsFlashPromotionProductRelation record) {
        return smsFlashPromotionProductRelationMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(SmsFlashPromotionProductRelation record) {
        return smsFlashPromotionProductRelationMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SmsFlashPromotionProductRelation record) {
        return smsFlashPromotionProductRelationMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(SmsFlashPromotionProductRelation record) {
        return smsFlashPromotionProductRelationMapper.insertSelective(record);
    }

    @Override
    public SmsFlashPromotionProductRelation selectByPrimaryKey(Long id) {
        return smsFlashPromotionProductRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsFlashPromotionProductRelation record) {
        return smsFlashPromotionProductRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsFlashPromotionProductRelation record) {
        return smsFlashPromotionProductRelationMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<SmsFlashPromotionProductRelation> list) {
        return smsFlashPromotionProductRelationMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<SmsFlashPromotionProductRelation> list) {
        return smsFlashPromotionProductRelationMapper.batchInsert(list);
    }

}
