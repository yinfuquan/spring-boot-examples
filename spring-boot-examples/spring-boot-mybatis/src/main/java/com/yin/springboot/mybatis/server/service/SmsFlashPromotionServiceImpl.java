package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.SmsFlashPromotion;
import com.yin.springboot.mybatis.mapper.SmsFlashPromotionMapper;
import com.yin.springboot.mybatis.server.SmsFlashPromotionService;
@Service
public class SmsFlashPromotionServiceImpl implements SmsFlashPromotionService{

    @Resource
    private SmsFlashPromotionMapper smsFlashPromotionMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return smsFlashPromotionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsFlashPromotion record) {
        return smsFlashPromotionMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(SmsFlashPromotion record) {
        return smsFlashPromotionMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SmsFlashPromotion record) {
        return smsFlashPromotionMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(SmsFlashPromotion record) {
        return smsFlashPromotionMapper.insertSelective(record);
    }

    @Override
    public SmsFlashPromotion selectByPrimaryKey(Long id) {
        return smsFlashPromotionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsFlashPromotion record) {
        return smsFlashPromotionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsFlashPromotion record) {
        return smsFlashPromotionMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<SmsFlashPromotion> list) {
        return smsFlashPromotionMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<SmsFlashPromotion> list) {
        return smsFlashPromotionMapper.batchInsert(list);
    }

}
