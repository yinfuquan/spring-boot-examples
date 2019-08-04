package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.SmsHomeBrand;
import com.yin.springboot.mybatis.mapper.SmsHomeBrandMapper;
import com.yin.springboot.mybatis.server.SmsHomeBrandService;
@Service
public class SmsHomeBrandServiceImpl implements SmsHomeBrandService{

    @Resource
    private SmsHomeBrandMapper smsHomeBrandMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return smsHomeBrandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsHomeBrand record) {
        return smsHomeBrandMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(SmsHomeBrand record) {
        return smsHomeBrandMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SmsHomeBrand record) {
        return smsHomeBrandMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(SmsHomeBrand record) {
        return smsHomeBrandMapper.insertSelective(record);
    }

    @Override
    public SmsHomeBrand selectByPrimaryKey(Long id) {
        return smsHomeBrandMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsHomeBrand record) {
        return smsHomeBrandMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsHomeBrand record) {
        return smsHomeBrandMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<SmsHomeBrand> list) {
        return smsHomeBrandMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<SmsHomeBrand> list) {
        return smsHomeBrandMapper.batchInsert(list);
    }

}
