package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.CmsSubjectCategoryMapper;
import com.yin.springboot.mybatis.domain.CmsSubjectCategory;
import com.yin.springboot.mybatis.server.CmsSubjectCategoryService;
@Service
public class CmsSubjectCategoryServiceImpl implements CmsSubjectCategoryService{

    @Resource
    private CmsSubjectCategoryMapper cmsSubjectCategoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cmsSubjectCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CmsSubjectCategory record) {
        return cmsSubjectCategoryMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(CmsSubjectCategory record) {
        return cmsSubjectCategoryMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CmsSubjectCategory record) {
        return cmsSubjectCategoryMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(CmsSubjectCategory record) {
        return cmsSubjectCategoryMapper.insertSelective(record);
    }

    @Override
    public CmsSubjectCategory selectByPrimaryKey(Long id) {
        return cmsSubjectCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsSubjectCategory record) {
        return cmsSubjectCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsSubjectCategory record) {
        return cmsSubjectCategoryMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CmsSubjectCategory> list) {
        return cmsSubjectCategoryMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CmsSubjectCategory> list) {
        return cmsSubjectCategoryMapper.batchInsert(list);
    }

}
