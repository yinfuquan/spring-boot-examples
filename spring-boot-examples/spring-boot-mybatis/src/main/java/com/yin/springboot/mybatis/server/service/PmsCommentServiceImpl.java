package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.PmsComment;
import com.yin.springboot.mybatis.mapper.PmsCommentMapper;
import com.yin.springboot.mybatis.server.PmsCommentService;
@Service
public class PmsCommentServiceImpl implements PmsCommentService{

    @Resource
    private PmsCommentMapper pmsCommentMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsCommentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsComment record) {
        return pmsCommentMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PmsComment record) {
        return pmsCommentMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PmsComment record) {
        return pmsCommentMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PmsComment record) {
        return pmsCommentMapper.insertSelective(record);
    }

    @Override
    public PmsComment selectByPrimaryKey(Long id) {
        return pmsCommentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsComment record) {
        return pmsCommentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsComment record) {
        return pmsCommentMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PmsComment> list) {
        return pmsCommentMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PmsComment> list) {
        return pmsCommentMapper.batchInsert(list);
    }

}
