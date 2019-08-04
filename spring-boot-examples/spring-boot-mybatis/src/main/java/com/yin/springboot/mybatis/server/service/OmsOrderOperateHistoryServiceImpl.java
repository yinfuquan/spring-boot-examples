package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yin.springboot.mybatis.mapper.OmsOrderOperateHistoryMapper;
import java.util.List;
import com.yin.springboot.mybatis.domain.OmsOrderOperateHistory;
import com.yin.springboot.mybatis.server.OmsOrderOperateHistoryService;
@Service
public class OmsOrderOperateHistoryServiceImpl implements OmsOrderOperateHistoryService{

    @Resource
    private OmsOrderOperateHistoryMapper omsOrderOperateHistoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return omsOrderOperateHistoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OmsOrderOperateHistory record) {
        return omsOrderOperateHistoryMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(OmsOrderOperateHistory record) {
        return omsOrderOperateHistoryMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(OmsOrderOperateHistory record) {
        return omsOrderOperateHistoryMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(OmsOrderOperateHistory record) {
        return omsOrderOperateHistoryMapper.insertSelective(record);
    }

    @Override
    public OmsOrderOperateHistory selectByPrimaryKey(Long id) {
        return omsOrderOperateHistoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OmsOrderOperateHistory record) {
        return omsOrderOperateHistoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OmsOrderOperateHistory record) {
        return omsOrderOperateHistoryMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<OmsOrderOperateHistory> list) {
        return omsOrderOperateHistoryMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<OmsOrderOperateHistory> list) {
        return omsOrderOperateHistoryMapper.batchInsert(list);
    }

}
