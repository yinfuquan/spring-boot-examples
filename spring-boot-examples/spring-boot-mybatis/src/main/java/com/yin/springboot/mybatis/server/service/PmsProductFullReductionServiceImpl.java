package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.PmsProductFullReduction;
import com.yin.springboot.mybatis.mapper.PmsProductFullReductionMapper;
import com.yin.springboot.mybatis.server.PmsProductFullReductionService;
@Service
public class PmsProductFullReductionServiceImpl implements PmsProductFullReductionService{

    @Resource
    private PmsProductFullReductionMapper pmsProductFullReductionMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsProductFullReductionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsProductFullReduction record) {
        return pmsProductFullReductionMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PmsProductFullReduction record) {
        return pmsProductFullReductionMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PmsProductFullReduction record) {
        return pmsProductFullReductionMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PmsProductFullReduction record) {
        return pmsProductFullReductionMapper.insertSelective(record);
    }

    @Override
    public PmsProductFullReduction selectByPrimaryKey(Long id) {
        return pmsProductFullReductionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsProductFullReduction record) {
        return pmsProductFullReductionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsProductFullReduction record) {
        return pmsProductFullReductionMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PmsProductFullReduction> list) {
        return pmsProductFullReductionMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PmsProductFullReduction> list) {
        return pmsProductFullReductionMapper.batchInsert(list);
    }

}
