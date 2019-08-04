package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yin.springboot.mybatis.domain.UmsMemberTask;
import java.util.List;
import com.yin.springboot.mybatis.mapper.UmsMemberTaskMapper;
import com.yin.springboot.mybatis.server.UmsMemberTaskService;
@Service
public class UmsMemberTaskServiceImpl implements UmsMemberTaskService{

    @Resource
    private UmsMemberTaskMapper umsMemberTaskMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsMemberTaskMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsMemberTask record) {
        return umsMemberTaskMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(UmsMemberTask record) {
        return umsMemberTaskMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UmsMemberTask record) {
        return umsMemberTaskMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(UmsMemberTask record) {
        return umsMemberTaskMapper.insertSelective(record);
    }

    @Override
    public UmsMemberTask selectByPrimaryKey(Long id) {
        return umsMemberTaskMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsMemberTask record) {
        return umsMemberTaskMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsMemberTask record) {
        return umsMemberTaskMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<UmsMemberTask> list) {
        return umsMemberTaskMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<UmsMemberTask> list) {
        return umsMemberTaskMapper.batchInsert(list);
    }

}
