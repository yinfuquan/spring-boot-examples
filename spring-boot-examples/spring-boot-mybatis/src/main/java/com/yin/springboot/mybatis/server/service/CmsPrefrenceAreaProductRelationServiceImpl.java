package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.CmsPrefrenceAreaProductRelationMapper;
import com.yin.springboot.mybatis.domain.CmsPrefrenceAreaProductRelation;
import com.yin.springboot.mybatis.server.CmsPrefrenceAreaProductRelationService;
@Service
public class CmsPrefrenceAreaProductRelationServiceImpl implements CmsPrefrenceAreaProductRelationService{

    @Resource
    private CmsPrefrenceAreaProductRelationMapper cmsPrefrenceAreaProductRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cmsPrefrenceAreaProductRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CmsPrefrenceAreaProductRelation record) {
        return cmsPrefrenceAreaProductRelationMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(CmsPrefrenceAreaProductRelation record) {
        return cmsPrefrenceAreaProductRelationMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CmsPrefrenceAreaProductRelation record) {
        return cmsPrefrenceAreaProductRelationMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(CmsPrefrenceAreaProductRelation record) {
        return cmsPrefrenceAreaProductRelationMapper.insertSelective(record);
    }

    @Override
    public CmsPrefrenceAreaProductRelation selectByPrimaryKey(Long id) {
        return cmsPrefrenceAreaProductRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsPrefrenceAreaProductRelation record) {
        return cmsPrefrenceAreaProductRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsPrefrenceAreaProductRelation record) {
        return cmsPrefrenceAreaProductRelationMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CmsPrefrenceAreaProductRelation> list) {
        return cmsPrefrenceAreaProductRelationMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CmsPrefrenceAreaProductRelation> list) {
        return cmsPrefrenceAreaProductRelationMapper.batchInsert(list);
    }

}
