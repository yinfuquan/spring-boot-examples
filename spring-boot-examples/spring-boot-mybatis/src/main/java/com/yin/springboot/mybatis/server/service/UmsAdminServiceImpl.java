package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.UmsAdmin;
import com.yin.springboot.mybatis.mapper.UmsAdminMapper;
import com.yin.springboot.mybatis.server.UmsAdminService;
@Service
public class UmsAdminServiceImpl implements UmsAdminService{

    @Resource
    private UmsAdminMapper umsAdminMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsAdminMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsAdmin record) {
        return umsAdminMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(UmsAdmin record) {
        return umsAdminMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UmsAdmin record) {
        return umsAdminMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(UmsAdmin record) {
        return umsAdminMapper.insertSelective(record);
    }

    @Override
    public UmsAdmin selectByPrimaryKey(Long id) {
        return umsAdminMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsAdmin record) {
        return umsAdminMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsAdmin record) {
        return umsAdminMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<UmsAdmin> list) {
        return umsAdminMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<UmsAdmin> list) {
        return umsAdminMapper.batchInsert(list);
    }

}
