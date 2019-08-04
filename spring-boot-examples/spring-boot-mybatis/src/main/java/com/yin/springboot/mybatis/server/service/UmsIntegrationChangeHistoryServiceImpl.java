package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.UmsIntegrationChangeHistoryMapper;
import com.yin.springboot.mybatis.domain.UmsIntegrationChangeHistory;
import com.yin.springboot.mybatis.server.UmsIntegrationChangeHistoryService;
@Service
public class UmsIntegrationChangeHistoryServiceImpl implements UmsIntegrationChangeHistoryService{

    @Resource
    private UmsIntegrationChangeHistoryMapper umsIntegrationChangeHistoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsIntegrationChangeHistoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsIntegrationChangeHistory record) {
        return umsIntegrationChangeHistoryMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(UmsIntegrationChangeHistory record) {
        return umsIntegrationChangeHistoryMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UmsIntegrationChangeHistory record) {
        return umsIntegrationChangeHistoryMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(UmsIntegrationChangeHistory record) {
        return umsIntegrationChangeHistoryMapper.insertSelective(record);
    }

    @Override
    public UmsIntegrationChangeHistory selectByPrimaryKey(Long id) {
        return umsIntegrationChangeHistoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsIntegrationChangeHistory record) {
        return umsIntegrationChangeHistoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsIntegrationChangeHistory record) {
        return umsIntegrationChangeHistoryMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<UmsIntegrationChangeHistory> list) {
        return umsIntegrationChangeHistoryMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<UmsIntegrationChangeHistory> list) {
        return umsIntegrationChangeHistoryMapper.batchInsert(list);
    }

}
