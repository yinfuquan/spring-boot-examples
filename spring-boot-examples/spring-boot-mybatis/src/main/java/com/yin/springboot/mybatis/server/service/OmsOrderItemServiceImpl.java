package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.OmsOrderItem;
import com.yin.springboot.mybatis.mapper.OmsOrderItemMapper;
import com.yin.springboot.mybatis.server.OmsOrderItemService;
@Service
public class OmsOrderItemServiceImpl implements OmsOrderItemService{

    @Resource
    private OmsOrderItemMapper omsOrderItemMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return omsOrderItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OmsOrderItem record) {
        return omsOrderItemMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(OmsOrderItem record) {
        return omsOrderItemMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(OmsOrderItem record) {
        return omsOrderItemMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(OmsOrderItem record) {
        return omsOrderItemMapper.insertSelective(record);
    }

    @Override
    public OmsOrderItem selectByPrimaryKey(Long id) {
        return omsOrderItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OmsOrderItem record) {
        return omsOrderItemMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OmsOrderItem record) {
        return omsOrderItemMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<OmsOrderItem> list) {
        return omsOrderItemMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<OmsOrderItem> list) {
        return omsOrderItemMapper.batchInsert(list);
    }

}
