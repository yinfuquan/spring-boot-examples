package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.UmsMember;
import com.yin.springboot.mybatis.mapper.UmsMemberMapper;
import com.yin.springboot.mybatis.server.UmsMemberService;
@Service
public class UmsMemberServiceImpl implements UmsMemberService{

    @Resource
    private UmsMemberMapper umsMemberMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsMemberMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsMember record) {
        return umsMemberMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(UmsMember record) {
        return umsMemberMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UmsMember record) {
        return umsMemberMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(UmsMember record) {
        return umsMemberMapper.insertSelective(record);
    }

    @Override
    public UmsMember selectByPrimaryKey(Long id) {
        return umsMemberMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsMember record) {
        return umsMemberMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsMember record) {
        return umsMemberMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<UmsMember> list) {
        return umsMemberMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<UmsMember> list) {
        return umsMemberMapper.batchInsert(list);
    }

}
