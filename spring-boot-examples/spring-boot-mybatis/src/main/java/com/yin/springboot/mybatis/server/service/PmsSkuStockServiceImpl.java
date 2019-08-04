package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.PmsSkuStock;
import com.yin.springboot.mybatis.mapper.PmsSkuStockMapper;
import com.yin.springboot.mybatis.server.PmsSkuStockService;
@Service
public class PmsSkuStockServiceImpl implements PmsSkuStockService{

    @Resource
    private PmsSkuStockMapper pmsSkuStockMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsSkuStockMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsSkuStock record) {
        return pmsSkuStockMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PmsSkuStock record) {
        return pmsSkuStockMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PmsSkuStock record) {
        return pmsSkuStockMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PmsSkuStock record) {
        return pmsSkuStockMapper.insertSelective(record);
    }

    @Override
    public PmsSkuStock selectByPrimaryKey(Long id) {
        return pmsSkuStockMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsSkuStock record) {
        return pmsSkuStockMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsSkuStock record) {
        return pmsSkuStockMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PmsSkuStock> list) {
        return pmsSkuStockMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PmsSkuStock> list) {
        return pmsSkuStockMapper.batchInsert(list);
    }

}
