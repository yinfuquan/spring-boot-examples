package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.CmsTopicCommentMapper;
import com.yin.springboot.mybatis.domain.CmsTopicComment;
import com.yin.springboot.mybatis.server.CmsTopicCommentService;
@Service
public class CmsTopicCommentServiceImpl implements CmsTopicCommentService{

    @Resource
    private CmsTopicCommentMapper cmsTopicCommentMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cmsTopicCommentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CmsTopicComment record) {
        return cmsTopicCommentMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(CmsTopicComment record) {
        return cmsTopicCommentMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CmsTopicComment record) {
        return cmsTopicCommentMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(CmsTopicComment record) {
        return cmsTopicCommentMapper.insertSelective(record);
    }

    @Override
    public CmsTopicComment selectByPrimaryKey(Long id) {
        return cmsTopicCommentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsTopicComment record) {
        return cmsTopicCommentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsTopicComment record) {
        return cmsTopicCommentMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CmsTopicComment> list) {
        return cmsTopicCommentMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CmsTopicComment> list) {
        return cmsTopicCommentMapper.batchInsert(list);
    }

}
