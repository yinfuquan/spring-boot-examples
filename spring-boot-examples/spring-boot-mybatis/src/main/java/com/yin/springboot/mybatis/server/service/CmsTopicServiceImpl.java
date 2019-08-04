package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.CmsTopic;
import com.yin.springboot.mybatis.mapper.CmsTopicMapper;
import com.yin.springboot.mybatis.server.CmsTopicService;
@Service
public class CmsTopicServiceImpl implements CmsTopicService{

    @Resource
    private CmsTopicMapper cmsTopicMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cmsTopicMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CmsTopic record) {
        return cmsTopicMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(CmsTopic record) {
        return cmsTopicMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CmsTopic record) {
        return cmsTopicMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(CmsTopic record) {
        return cmsTopicMapper.insertSelective(record);
    }

    @Override
    public CmsTopic selectByPrimaryKey(Long id) {
        return cmsTopicMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsTopic record) {
        return cmsTopicMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsTopic record) {
        return cmsTopicMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CmsTopic> list) {
        return cmsTopicMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CmsTopic> list) {
        return cmsTopicMapper.batchInsert(list);
    }

}
