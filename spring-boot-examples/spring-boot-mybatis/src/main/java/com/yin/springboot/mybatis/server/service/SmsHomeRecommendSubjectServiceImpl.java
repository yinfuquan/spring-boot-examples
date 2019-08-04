package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.SmsHomeRecommendSubjectMapper;
import com.yin.springboot.mybatis.domain.SmsHomeRecommendSubject;
import com.yin.springboot.mybatis.server.SmsHomeRecommendSubjectService;
@Service
public class SmsHomeRecommendSubjectServiceImpl implements SmsHomeRecommendSubjectService{

    @Resource
    private SmsHomeRecommendSubjectMapper smsHomeRecommendSubjectMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return smsHomeRecommendSubjectMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsHomeRecommendSubject record) {
        return smsHomeRecommendSubjectMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(SmsHomeRecommendSubject record) {
        return smsHomeRecommendSubjectMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SmsHomeRecommendSubject record) {
        return smsHomeRecommendSubjectMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(SmsHomeRecommendSubject record) {
        return smsHomeRecommendSubjectMapper.insertSelective(record);
    }

    @Override
    public SmsHomeRecommendSubject selectByPrimaryKey(Long id) {
        return smsHomeRecommendSubjectMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsHomeRecommendSubject record) {
        return smsHomeRecommendSubjectMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsHomeRecommendSubject record) {
        return smsHomeRecommendSubjectMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<SmsHomeRecommendSubject> list) {
        return smsHomeRecommendSubjectMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<SmsHomeRecommendSubject> list) {
        return smsHomeRecommendSubjectMapper.batchInsert(list);
    }

}
