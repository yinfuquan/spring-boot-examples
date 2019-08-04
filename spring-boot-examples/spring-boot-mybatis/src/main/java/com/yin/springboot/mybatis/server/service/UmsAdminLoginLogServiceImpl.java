package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yin.springboot.mybatis.domain.UmsAdminLoginLog;
import java.util.List;
import com.yin.springboot.mybatis.mapper.UmsAdminLoginLogMapper;
import com.yin.springboot.mybatis.server.UmsAdminLoginLogService;
@Service
public class UmsAdminLoginLogServiceImpl implements UmsAdminLoginLogService{

    @Resource
    private UmsAdminLoginLogMapper umsAdminLoginLogMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsAdminLoginLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsAdminLoginLog record) {
        return umsAdminLoginLogMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(UmsAdminLoginLog record) {
        return umsAdminLoginLogMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UmsAdminLoginLog record) {
        return umsAdminLoginLogMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(UmsAdminLoginLog record) {
        return umsAdminLoginLogMapper.insertSelective(record);
    }

    @Override
    public UmsAdminLoginLog selectByPrimaryKey(Long id) {
        return umsAdminLoginLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsAdminLoginLog record) {
        return umsAdminLoginLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsAdminLoginLog record) {
        return umsAdminLoginLogMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<UmsAdminLoginLog> list) {
        return umsAdminLoginLogMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<UmsAdminLoginLog> list) {
        return umsAdminLoginLogMapper.batchInsert(list);
    }

}
