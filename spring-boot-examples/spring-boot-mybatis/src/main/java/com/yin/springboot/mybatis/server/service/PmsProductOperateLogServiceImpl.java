package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.PmsProductOperateLog;
import com.yin.springboot.mybatis.mapper.PmsProductOperateLogMapper;
import com.yin.springboot.mybatis.server.PmsProductOperateLogService;
@Service
public class PmsProductOperateLogServiceImpl implements PmsProductOperateLogService{

    @Resource
    private PmsProductOperateLogMapper pmsProductOperateLogMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsProductOperateLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsProductOperateLog record) {
        return pmsProductOperateLogMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PmsProductOperateLog record) {
        return pmsProductOperateLogMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PmsProductOperateLog record) {
        return pmsProductOperateLogMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PmsProductOperateLog record) {
        return pmsProductOperateLogMapper.insertSelective(record);
    }

    @Override
    public PmsProductOperateLog selectByPrimaryKey(Long id) {
        return pmsProductOperateLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsProductOperateLog record) {
        return pmsProductOperateLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsProductOperateLog record) {
        return pmsProductOperateLogMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PmsProductOperateLog> list) {
        return pmsProductOperateLogMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PmsProductOperateLog> list) {
        return pmsProductOperateLogMapper.batchInsert(list);
    }

}
