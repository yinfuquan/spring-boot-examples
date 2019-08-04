package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.OmsOrderReturnReasonMapper;
import com.yin.springboot.mybatis.domain.OmsOrderReturnReason;
import com.yin.springboot.mybatis.server.OmsOrderReturnReasonService;
@Service
public class OmsOrderReturnReasonServiceImpl implements OmsOrderReturnReasonService{

    @Resource
    private OmsOrderReturnReasonMapper omsOrderReturnReasonMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return omsOrderReturnReasonMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OmsOrderReturnReason record) {
        return omsOrderReturnReasonMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(OmsOrderReturnReason record) {
        return omsOrderReturnReasonMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(OmsOrderReturnReason record) {
        return omsOrderReturnReasonMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(OmsOrderReturnReason record) {
        return omsOrderReturnReasonMapper.insertSelective(record);
    }

    @Override
    public OmsOrderReturnReason selectByPrimaryKey(Long id) {
        return omsOrderReturnReasonMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OmsOrderReturnReason record) {
        return omsOrderReturnReasonMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OmsOrderReturnReason record) {
        return omsOrderReturnReasonMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<OmsOrderReturnReason> list) {
        return omsOrderReturnReasonMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<OmsOrderReturnReason> list) {
        return omsOrderReturnReasonMapper.batchInsert(list);
    }

}
