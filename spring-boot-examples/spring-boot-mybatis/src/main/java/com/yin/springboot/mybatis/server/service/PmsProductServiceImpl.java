package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.PmsProductMapper;
import com.yin.springboot.mybatis.domain.PmsProduct;
import com.yin.springboot.mybatis.server.PmsProductService;
@Service
public class PmsProductServiceImpl implements PmsProductService{

    @Resource
    private PmsProductMapper pmsProductMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsProductMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsProduct record) {
        return pmsProductMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PmsProduct record) {
        return pmsProductMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PmsProduct record) {
        return pmsProductMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PmsProduct record) {
        return pmsProductMapper.insertSelective(record);
    }

    @Override
    public PmsProduct selectByPrimaryKey(Long id) {
        return pmsProductMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsProduct record) {
        return pmsProductMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsProduct record) {
        return pmsProductMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PmsProduct> list) {
        return pmsProductMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PmsProduct> list) {
        return pmsProductMapper.batchInsert(list);
    }

}
