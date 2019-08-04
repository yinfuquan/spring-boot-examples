package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.PmsCommentReplayMapper;
import com.yin.springboot.mybatis.domain.PmsCommentReplay;
import com.yin.springboot.mybatis.server.PmsCommentReplayService;
@Service
public class PmsCommentReplayServiceImpl implements PmsCommentReplayService{

    @Resource
    private PmsCommentReplayMapper pmsCommentReplayMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsCommentReplayMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsCommentReplay record) {
        return pmsCommentReplayMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PmsCommentReplay record) {
        return pmsCommentReplayMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PmsCommentReplay record) {
        return pmsCommentReplayMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PmsCommentReplay record) {
        return pmsCommentReplayMapper.insertSelective(record);
    }

    @Override
    public PmsCommentReplay selectByPrimaryKey(Long id) {
        return pmsCommentReplayMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsCommentReplay record) {
        return pmsCommentReplayMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsCommentReplay record) {
        return pmsCommentReplayMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PmsCommentReplay> list) {
        return pmsCommentReplayMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PmsCommentReplay> list) {
        return pmsCommentReplayMapper.batchInsert(list);
    }

}
