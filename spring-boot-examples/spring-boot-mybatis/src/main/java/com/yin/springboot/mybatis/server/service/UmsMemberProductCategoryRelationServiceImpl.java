package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.UmsMemberProductCategoryRelation;
import com.yin.springboot.mybatis.mapper.UmsMemberProductCategoryRelationMapper;
import com.yin.springboot.mybatis.server.UmsMemberProductCategoryRelationService;
@Service
public class UmsMemberProductCategoryRelationServiceImpl implements UmsMemberProductCategoryRelationService{

    @Resource
    private UmsMemberProductCategoryRelationMapper umsMemberProductCategoryRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsMemberProductCategoryRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsMemberProductCategoryRelation record) {
        return umsMemberProductCategoryRelationMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(UmsMemberProductCategoryRelation record) {
        return umsMemberProductCategoryRelationMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UmsMemberProductCategoryRelation record) {
        return umsMemberProductCategoryRelationMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(UmsMemberProductCategoryRelation record) {
        return umsMemberProductCategoryRelationMapper.insertSelective(record);
    }

    @Override
    public UmsMemberProductCategoryRelation selectByPrimaryKey(Long id) {
        return umsMemberProductCategoryRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsMemberProductCategoryRelation record) {
        return umsMemberProductCategoryRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsMemberProductCategoryRelation record) {
        return umsMemberProductCategoryRelationMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<UmsMemberProductCategoryRelation> list) {
        return umsMemberProductCategoryRelationMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<UmsMemberProductCategoryRelation> list) {
        return umsMemberProductCategoryRelationMapper.batchInsert(list);
    }

}
