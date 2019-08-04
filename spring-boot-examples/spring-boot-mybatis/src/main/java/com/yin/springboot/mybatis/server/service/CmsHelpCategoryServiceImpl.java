package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.CmsHelpCategoryMapper;
import com.yin.springboot.mybatis.domain.CmsHelpCategory;
import com.yin.springboot.mybatis.server.CmsHelpCategoryService;
@Service
public class CmsHelpCategoryServiceImpl implements CmsHelpCategoryService{

    @Resource
    private CmsHelpCategoryMapper cmsHelpCategoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cmsHelpCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CmsHelpCategory record) {
        return cmsHelpCategoryMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(CmsHelpCategory record) {
        return cmsHelpCategoryMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CmsHelpCategory record) {
        return cmsHelpCategoryMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(CmsHelpCategory record) {
        return cmsHelpCategoryMapper.insertSelective(record);
    }

    @Override
    public CmsHelpCategory selectByPrimaryKey(Long id) {
        return cmsHelpCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsHelpCategory record) {
        return cmsHelpCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsHelpCategory record) {
        return cmsHelpCategoryMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CmsHelpCategory> list) {
        return cmsHelpCategoryMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CmsHelpCategory> list) {
        return cmsHelpCategoryMapper.batchInsert(list);
    }

}
