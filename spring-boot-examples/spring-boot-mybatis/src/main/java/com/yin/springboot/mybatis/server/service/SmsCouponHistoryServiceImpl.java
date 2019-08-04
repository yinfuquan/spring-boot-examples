package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.SmsCouponHistory;
import com.yin.springboot.mybatis.mapper.SmsCouponHistoryMapper;
import com.yin.springboot.mybatis.server.SmsCouponHistoryService;
@Service
public class SmsCouponHistoryServiceImpl implements SmsCouponHistoryService{

    @Resource
    private SmsCouponHistoryMapper smsCouponHistoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return smsCouponHistoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsCouponHistory record) {
        return smsCouponHistoryMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(SmsCouponHistory record) {
        return smsCouponHistoryMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SmsCouponHistory record) {
        return smsCouponHistoryMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(SmsCouponHistory record) {
        return smsCouponHistoryMapper.insertSelective(record);
    }

    @Override
    public SmsCouponHistory selectByPrimaryKey(Long id) {
        return smsCouponHistoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsCouponHistory record) {
        return smsCouponHistoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsCouponHistory record) {
        return smsCouponHistoryMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<SmsCouponHistory> list) {
        return smsCouponHistoryMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<SmsCouponHistory> list) {
        return smsCouponHistoryMapper.batchInsert(list);
    }

}
