package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.OmsOrderMapper;
import com.yin.springboot.mybatis.domain.OmsOrder;
import com.yin.springboot.mybatis.server.OmsOrderService;
@Service
public class OmsOrderServiceImpl implements OmsOrderService{

    @Resource
    private OmsOrderMapper omsOrderMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return omsOrderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OmsOrder record) {
        return omsOrderMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(OmsOrder record) {
        return omsOrderMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(OmsOrder record) {
        return omsOrderMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(OmsOrder record) {
        return omsOrderMapper.insertSelective(record);
    }

    @Override
    public OmsOrder selectByPrimaryKey(Long id) {
        return omsOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OmsOrder record) {
        return omsOrderMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OmsOrder record) {
        return omsOrderMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<OmsOrder> list) {
        return omsOrderMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<OmsOrder> list) {
        return omsOrderMapper.batchInsert(list);
    }

}
