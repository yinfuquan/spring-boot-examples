package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.SmsHomeRecommendProductMapper;
import com.yin.springboot.mybatis.domain.SmsHomeRecommendProduct;
import com.yin.springboot.mybatis.server.SmsHomeRecommendProductService;
@Service
public class SmsHomeRecommendProductServiceImpl implements SmsHomeRecommendProductService{

    @Resource
    private SmsHomeRecommendProductMapper smsHomeRecommendProductMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return smsHomeRecommendProductMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsHomeRecommendProduct record) {
        return smsHomeRecommendProductMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(SmsHomeRecommendProduct record) {
        return smsHomeRecommendProductMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SmsHomeRecommendProduct record) {
        return smsHomeRecommendProductMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(SmsHomeRecommendProduct record) {
        return smsHomeRecommendProductMapper.insertSelective(record);
    }

    @Override
    public SmsHomeRecommendProduct selectByPrimaryKey(Long id) {
        return smsHomeRecommendProductMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsHomeRecommendProduct record) {
        return smsHomeRecommendProductMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsHomeRecommendProduct record) {
        return smsHomeRecommendProductMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<SmsHomeRecommendProduct> list) {
        return smsHomeRecommendProductMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<SmsHomeRecommendProduct> list) {
        return smsHomeRecommendProductMapper.batchInsert(list);
    }

}
