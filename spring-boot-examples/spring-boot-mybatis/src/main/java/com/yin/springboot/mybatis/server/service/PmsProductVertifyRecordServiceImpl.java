package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.PmsProductVertifyRecordMapper;
import com.yin.springboot.mybatis.domain.PmsProductVertifyRecord;
import com.yin.springboot.mybatis.server.PmsProductVertifyRecordService;
@Service
public class PmsProductVertifyRecordServiceImpl implements PmsProductVertifyRecordService{

    @Resource
    private PmsProductVertifyRecordMapper pmsProductVertifyRecordMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsProductVertifyRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsProductVertifyRecord record) {
        return pmsProductVertifyRecordMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PmsProductVertifyRecord record) {
        return pmsProductVertifyRecordMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PmsProductVertifyRecord record) {
        return pmsProductVertifyRecordMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PmsProductVertifyRecord record) {
        return pmsProductVertifyRecordMapper.insertSelective(record);
    }

    @Override
    public PmsProductVertifyRecord selectByPrimaryKey(Long id) {
        return pmsProductVertifyRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsProductVertifyRecord record) {
        return pmsProductVertifyRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsProductVertifyRecord record) {
        return pmsProductVertifyRecordMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PmsProductVertifyRecord> list) {
        return pmsProductVertifyRecordMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PmsProductVertifyRecord> list) {
        return pmsProductVertifyRecordMapper.batchInsert(list);
    }

}
