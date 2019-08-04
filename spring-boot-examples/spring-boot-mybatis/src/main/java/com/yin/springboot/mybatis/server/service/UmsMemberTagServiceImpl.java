package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.UmsMemberTag;
import com.yin.springboot.mybatis.mapper.UmsMemberTagMapper;
import com.yin.springboot.mybatis.server.UmsMemberTagService;
@Service
public class UmsMemberTagServiceImpl implements UmsMemberTagService{

    @Resource
    private UmsMemberTagMapper umsMemberTagMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsMemberTagMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsMemberTag record) {
        return umsMemberTagMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(UmsMemberTag record) {
        return umsMemberTagMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UmsMemberTag record) {
        return umsMemberTagMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(UmsMemberTag record) {
        return umsMemberTagMapper.insertSelective(record);
    }

    @Override
    public UmsMemberTag selectByPrimaryKey(Long id) {
        return umsMemberTagMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsMemberTag record) {
        return umsMemberTagMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsMemberTag record) {
        return umsMemberTagMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<UmsMemberTag> list) {
        return umsMemberTagMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<UmsMemberTag> list) {
        return umsMemberTagMapper.batchInsert(list);
    }

}
