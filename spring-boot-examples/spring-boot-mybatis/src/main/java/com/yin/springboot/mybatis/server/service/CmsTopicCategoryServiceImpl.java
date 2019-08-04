package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yin.springboot.mybatis.mapper.CmsTopicCategoryMapper;
import java.util.List;
import com.yin.springboot.mybatis.domain.CmsTopicCategory;
import com.yin.springboot.mybatis.server.CmsTopicCategoryService;
@Service
public class CmsTopicCategoryServiceImpl implements CmsTopicCategoryService{

    @Resource
    private CmsTopicCategoryMapper cmsTopicCategoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cmsTopicCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CmsTopicCategory record) {
        return cmsTopicCategoryMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(CmsTopicCategory record) {
        return cmsTopicCategoryMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CmsTopicCategory record) {
        return cmsTopicCategoryMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(CmsTopicCategory record) {
        return cmsTopicCategoryMapper.insertSelective(record);
    }

    @Override
    public CmsTopicCategory selectByPrimaryKey(Long id) {
        return cmsTopicCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsTopicCategory record) {
        return cmsTopicCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsTopicCategory record) {
        return cmsTopicCategoryMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CmsTopicCategory> list) {
        return cmsTopicCategoryMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CmsTopicCategory> list) {
        return cmsTopicCategoryMapper.batchInsert(list);
    }

}
