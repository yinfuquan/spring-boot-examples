package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.SmsCoupon;
import com.yin.springboot.mybatis.mapper.SmsCouponMapper;
import com.yin.springboot.mybatis.server.SmsCouponService;
@Service
public class SmsCouponServiceImpl implements SmsCouponService{

    @Resource
    private SmsCouponMapper smsCouponMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return smsCouponMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsCoupon record) {
        return smsCouponMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(SmsCoupon record) {
        return smsCouponMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SmsCoupon record) {
        return smsCouponMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(SmsCoupon record) {
        return smsCouponMapper.insertSelective(record);
    }

    @Override
    public SmsCoupon selectByPrimaryKey(Long id) {
        return smsCouponMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsCoupon record) {
        return smsCouponMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsCoupon record) {
        return smsCouponMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<SmsCoupon> list) {
        return smsCouponMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<SmsCoupon> list) {
        return smsCouponMapper.batchInsert(list);
    }

}
