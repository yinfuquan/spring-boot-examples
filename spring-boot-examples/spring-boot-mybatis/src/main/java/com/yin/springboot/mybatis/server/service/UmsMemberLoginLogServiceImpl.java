package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.UmsMemberLoginLogMapper;
import com.yin.springboot.mybatis.domain.UmsMemberLoginLog;
import com.yin.springboot.mybatis.server.UmsMemberLoginLogService;
@Service
public class UmsMemberLoginLogServiceImpl implements UmsMemberLoginLogService{

    @Resource
    private UmsMemberLoginLogMapper umsMemberLoginLogMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsMemberLoginLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsMemberLoginLog record) {
        return umsMemberLoginLogMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(UmsMemberLoginLog record) {
        return umsMemberLoginLogMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UmsMemberLoginLog record) {
        return umsMemberLoginLogMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(UmsMemberLoginLog record) {
        return umsMemberLoginLogMapper.insertSelective(record);
    }

    @Override
    public UmsMemberLoginLog selectByPrimaryKey(Long id) {
        return umsMemberLoginLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsMemberLoginLog record) {
        return umsMemberLoginLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsMemberLoginLog record) {
        return umsMemberLoginLogMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<UmsMemberLoginLog> list) {
        return umsMemberLoginLogMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<UmsMemberLoginLog> list) {
        return umsMemberLoginLogMapper.batchInsert(list);
    }

}
