package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yin.springboot.mybatis.mapper.PmsProductLadderMapper;
import java.util.List;
import com.yin.springboot.mybatis.domain.PmsProductLadder;
import com.yin.springboot.mybatis.server.PmsProductLadderService;
@Service
public class PmsProductLadderServiceImpl implements PmsProductLadderService{

    @Resource
    private PmsProductLadderMapper pmsProductLadderMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsProductLadderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsProductLadder record) {
        return pmsProductLadderMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PmsProductLadder record) {
        return pmsProductLadderMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PmsProductLadder record) {
        return pmsProductLadderMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PmsProductLadder record) {
        return pmsProductLadderMapper.insertSelective(record);
    }

    @Override
    public PmsProductLadder selectByPrimaryKey(Long id) {
        return pmsProductLadderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsProductLadder record) {
        return pmsProductLadderMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsProductLadder record) {
        return pmsProductLadderMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PmsProductLadder> list) {
        return pmsProductLadderMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PmsProductLadder> list) {
        return pmsProductLadderMapper.batchInsert(list);
    }

}
