package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yin.springboot.mybatis.mapper.CmsSubjectCommentMapper;
import java.util.List;
import com.yin.springboot.mybatis.domain.CmsSubjectComment;
import com.yin.springboot.mybatis.server.CmsSubjectCommentService;
@Service
public class CmsSubjectCommentServiceImpl implements CmsSubjectCommentService{

    @Resource
    private CmsSubjectCommentMapper cmsSubjectCommentMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cmsSubjectCommentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CmsSubjectComment record) {
        return cmsSubjectCommentMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(CmsSubjectComment record) {
        return cmsSubjectCommentMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CmsSubjectComment record) {
        return cmsSubjectCommentMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(CmsSubjectComment record) {
        return cmsSubjectCommentMapper.insertSelective(record);
    }

    @Override
    public CmsSubjectComment selectByPrimaryKey(Long id) {
        return cmsSubjectCommentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsSubjectComment record) {
        return cmsSubjectCommentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsSubjectComment record) {
        return cmsSubjectCommentMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CmsSubjectComment> list) {
        return cmsSubjectCommentMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CmsSubjectComment> list) {
        return cmsSubjectCommentMapper.batchInsert(list);
    }

}
