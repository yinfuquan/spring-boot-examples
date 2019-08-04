package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.SmsFlashPromotionSessionMapper;
import com.yin.springboot.mybatis.domain.SmsFlashPromotionSession;
import com.yin.springboot.mybatis.server.SmsFlashPromotionSessionService;
@Service
public class SmsFlashPromotionSessionServiceImpl implements SmsFlashPromotionSessionService{

    @Resource
    private SmsFlashPromotionSessionMapper smsFlashPromotionSessionMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return smsFlashPromotionSessionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsFlashPromotionSession record) {
        return smsFlashPromotionSessionMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(SmsFlashPromotionSession record) {
        return smsFlashPromotionSessionMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SmsFlashPromotionSession record) {
        return smsFlashPromotionSessionMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(SmsFlashPromotionSession record) {
        return smsFlashPromotionSessionMapper.insertSelective(record);
    }

    @Override
    public SmsFlashPromotionSession selectByPrimaryKey(Long id) {
        return smsFlashPromotionSessionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsFlashPromotionSession record) {
        return smsFlashPromotionSessionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsFlashPromotionSession record) {
        return smsFlashPromotionSessionMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<SmsFlashPromotionSession> list) {
        return smsFlashPromotionSessionMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<SmsFlashPromotionSession> list) {
        return smsFlashPromotionSessionMapper.batchInsert(list);
    }

}
