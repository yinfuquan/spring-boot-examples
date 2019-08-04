package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.CmsSubjectProductRelationMapper;
import com.yin.springboot.mybatis.domain.CmsSubjectProductRelation;
import com.yin.springboot.mybatis.server.CmsSubjectProductRelationService;
@Service
public class CmsSubjectProductRelationServiceImpl implements CmsSubjectProductRelationService{

    @Resource
    private CmsSubjectProductRelationMapper cmsSubjectProductRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cmsSubjectProductRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CmsSubjectProductRelation record) {
        return cmsSubjectProductRelationMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(CmsSubjectProductRelation record) {
        return cmsSubjectProductRelationMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CmsSubjectProductRelation record) {
        return cmsSubjectProductRelationMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(CmsSubjectProductRelation record) {
        return cmsSubjectProductRelationMapper.insertSelective(record);
    }

    @Override
    public CmsSubjectProductRelation selectByPrimaryKey(Long id) {
        return cmsSubjectProductRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsSubjectProductRelation record) {
        return cmsSubjectProductRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsSubjectProductRelation record) {
        return cmsSubjectProductRelationMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CmsSubjectProductRelation> list) {
        return cmsSubjectProductRelationMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CmsSubjectProductRelation> list) {
        return cmsSubjectProductRelationMapper.batchInsert(list);
    }

}
