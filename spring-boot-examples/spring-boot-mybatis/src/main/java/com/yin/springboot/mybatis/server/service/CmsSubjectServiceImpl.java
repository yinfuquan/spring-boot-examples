package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.CmsSubject;
import com.yin.springboot.mybatis.mapper.CmsSubjectMapper;
import com.yin.springboot.mybatis.server.CmsSubjectService;
@Service
public class CmsSubjectServiceImpl implements CmsSubjectService{

    @Resource
    private CmsSubjectMapper cmsSubjectMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cmsSubjectMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CmsSubject record) {
        return cmsSubjectMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(CmsSubject record) {
        return cmsSubjectMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CmsSubject record) {
        return cmsSubjectMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(CmsSubject record) {
        return cmsSubjectMapper.insertSelective(record);
    }

    @Override
    public CmsSubject selectByPrimaryKey(Long id) {
        return cmsSubjectMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsSubject record) {
        return cmsSubjectMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsSubject record) {
        return cmsSubjectMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CmsSubject> list) {
        return cmsSubjectMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CmsSubject> list) {
        return cmsSubjectMapper.batchInsert(list);
    }

}
