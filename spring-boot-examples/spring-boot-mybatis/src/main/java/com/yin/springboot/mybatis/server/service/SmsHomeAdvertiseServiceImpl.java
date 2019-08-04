package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.SmsHomeAdvertiseMapper;
import com.yin.springboot.mybatis.domain.SmsHomeAdvertise;
import com.yin.springboot.mybatis.server.SmsHomeAdvertiseService;
@Service
public class SmsHomeAdvertiseServiceImpl implements SmsHomeAdvertiseService{

    @Resource
    private SmsHomeAdvertiseMapper smsHomeAdvertiseMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return smsHomeAdvertiseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsHomeAdvertise record) {
        return smsHomeAdvertiseMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(SmsHomeAdvertise record) {
        return smsHomeAdvertiseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SmsHomeAdvertise record) {
        return smsHomeAdvertiseMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(SmsHomeAdvertise record) {
        return smsHomeAdvertiseMapper.insertSelective(record);
    }

    @Override
    public SmsHomeAdvertise selectByPrimaryKey(Long id) {
        return smsHomeAdvertiseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsHomeAdvertise record) {
        return smsHomeAdvertiseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsHomeAdvertise record) {
        return smsHomeAdvertiseMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<SmsHomeAdvertise> list) {
        return smsHomeAdvertiseMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<SmsHomeAdvertise> list) {
        return smsHomeAdvertiseMapper.batchInsert(list);
    }

}
