package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.UmsMemberLevelMapper;
import com.yin.springboot.mybatis.domain.UmsMemberLevel;
import com.yin.springboot.mybatis.server.UmsMemberLevelService;
@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService{

    @Resource
    private UmsMemberLevelMapper umsMemberLevelMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsMemberLevelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsMemberLevel record) {
        return umsMemberLevelMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(UmsMemberLevel record) {
        return umsMemberLevelMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UmsMemberLevel record) {
        return umsMemberLevelMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(UmsMemberLevel record) {
        return umsMemberLevelMapper.insertSelective(record);
    }

    @Override
    public UmsMemberLevel selectByPrimaryKey(Long id) {
        return umsMemberLevelMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsMemberLevel record) {
        return umsMemberLevelMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsMemberLevel record) {
        return umsMemberLevelMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<UmsMemberLevel> list) {
        return umsMemberLevelMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<UmsMemberLevel> list) {
        return umsMemberLevelMapper.batchInsert(list);
    }

}
