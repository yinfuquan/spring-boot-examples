package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yin.springboot.mybatis.mapper.UmsGrowthChangeHistoryMapper;
import com.yin.springboot.mybatis.domain.UmsGrowthChangeHistory;
import java.util.List;
import com.yin.springboot.mybatis.server.UmsGrowthChangeHistoryService;
@Service
public class UmsGrowthChangeHistoryServiceImpl implements UmsGrowthChangeHistoryService{

    @Resource
    private UmsGrowthChangeHistoryMapper umsGrowthChangeHistoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsGrowthChangeHistoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsGrowthChangeHistory record) {
        return umsGrowthChangeHistoryMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(UmsGrowthChangeHistory record) {
        return umsGrowthChangeHistoryMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UmsGrowthChangeHistory record) {
        return umsGrowthChangeHistoryMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(UmsGrowthChangeHistory record) {
        return umsGrowthChangeHistoryMapper.insertSelective(record);
    }

    @Override
    public UmsGrowthChangeHistory selectByPrimaryKey(Long id) {
        return umsGrowthChangeHistoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsGrowthChangeHistory record) {
        return umsGrowthChangeHistoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsGrowthChangeHistory record) {
        return umsGrowthChangeHistoryMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<UmsGrowthChangeHistory> list) {
        return umsGrowthChangeHistoryMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<UmsGrowthChangeHistory> list) {
        return umsGrowthChangeHistoryMapper.batchInsert(list);
    }

}
