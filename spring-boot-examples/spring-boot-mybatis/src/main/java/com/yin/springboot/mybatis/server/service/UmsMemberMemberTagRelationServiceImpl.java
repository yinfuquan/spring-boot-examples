package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.UmsMemberMemberTagRelation;
import com.yin.springboot.mybatis.mapper.UmsMemberMemberTagRelationMapper;
import com.yin.springboot.mybatis.server.UmsMemberMemberTagRelationService;
@Service
public class UmsMemberMemberTagRelationServiceImpl implements UmsMemberMemberTagRelationService{

    @Resource
    private UmsMemberMemberTagRelationMapper umsMemberMemberTagRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsMemberMemberTagRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsMemberMemberTagRelation record) {
        return umsMemberMemberTagRelationMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(UmsMemberMemberTagRelation record) {
        return umsMemberMemberTagRelationMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UmsMemberMemberTagRelation record) {
        return umsMemberMemberTagRelationMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(UmsMemberMemberTagRelation record) {
        return umsMemberMemberTagRelationMapper.insertSelective(record);
    }

    @Override
    public UmsMemberMemberTagRelation selectByPrimaryKey(Long id) {
        return umsMemberMemberTagRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsMemberMemberTagRelation record) {
        return umsMemberMemberTagRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsMemberMemberTagRelation record) {
        return umsMemberMemberTagRelationMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<UmsMemberMemberTagRelation> list) {
        return umsMemberMemberTagRelationMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<UmsMemberMemberTagRelation> list) {
        return umsMemberMemberTagRelationMapper.batchInsert(list);
    }

}
