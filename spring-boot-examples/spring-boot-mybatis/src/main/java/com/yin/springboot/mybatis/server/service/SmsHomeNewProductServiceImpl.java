package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yin.springboot.mybatis.mapper.SmsHomeNewProductMapper;
import java.util.List;
import com.yin.springboot.mybatis.domain.SmsHomeNewProduct;
import com.yin.springboot.mybatis.server.SmsHomeNewProductService;
@Service
public class SmsHomeNewProductServiceImpl implements SmsHomeNewProductService{

    @Resource
    private SmsHomeNewProductMapper smsHomeNewProductMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return smsHomeNewProductMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsHomeNewProduct record) {
        return smsHomeNewProductMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(SmsHomeNewProduct record) {
        return smsHomeNewProductMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SmsHomeNewProduct record) {
        return smsHomeNewProductMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(SmsHomeNewProduct record) {
        return smsHomeNewProductMapper.insertSelective(record);
    }

    @Override
    public SmsHomeNewProduct selectByPrimaryKey(Long id) {
        return smsHomeNewProductMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsHomeNewProduct record) {
        return smsHomeNewProductMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsHomeNewProduct record) {
        return smsHomeNewProductMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<SmsHomeNewProduct> list) {
        return smsHomeNewProductMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<SmsHomeNewProduct> list) {
        return smsHomeNewProductMapper.batchInsert(list);
    }

}
