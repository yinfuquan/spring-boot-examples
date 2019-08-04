package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yin.springboot.mybatis.mapper.SmsFlashPromotionLogMapper;
import java.util.List;
import com.yin.springboot.mybatis.domain.SmsFlashPromotionLog;
import com.yin.springboot.mybatis.server.SmsFlashPromotionLogService;
@Service
public class SmsFlashPromotionLogServiceImpl implements SmsFlashPromotionLogService{

    @Resource
    private SmsFlashPromotionLogMapper smsFlashPromotionLogMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return smsFlashPromotionLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsFlashPromotionLog record) {
        return smsFlashPromotionLogMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(SmsFlashPromotionLog record) {
        return smsFlashPromotionLogMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SmsFlashPromotionLog record) {
        return smsFlashPromotionLogMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(SmsFlashPromotionLog record) {
        return smsFlashPromotionLogMapper.insertSelective(record);
    }

    @Override
    public SmsFlashPromotionLog selectByPrimaryKey(Integer id) {
        return smsFlashPromotionLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsFlashPromotionLog record) {
        return smsFlashPromotionLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsFlashPromotionLog record) {
        return smsFlashPromotionLogMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<SmsFlashPromotionLog> list) {
        return smsFlashPromotionLogMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<SmsFlashPromotionLog> list) {
        return smsFlashPromotionLogMapper.batchInsert(list);
    }

}
