package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yin.springboot.mybatis.mapper.PmsMemberPriceMapper;
import java.util.List;
import com.yin.springboot.mybatis.domain.PmsMemberPrice;
import com.yin.springboot.mybatis.server.PmsMemberPriceService;
@Service
public class PmsMemberPriceServiceImpl implements PmsMemberPriceService{

    @Resource
    private PmsMemberPriceMapper pmsMemberPriceMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsMemberPriceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsMemberPrice record) {
        return pmsMemberPriceMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PmsMemberPrice record) {
        return pmsMemberPriceMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PmsMemberPrice record) {
        return pmsMemberPriceMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PmsMemberPrice record) {
        return pmsMemberPriceMapper.insertSelective(record);
    }

    @Override
    public PmsMemberPrice selectByPrimaryKey(Long id) {
        return pmsMemberPriceMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsMemberPrice record) {
        return pmsMemberPriceMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsMemberPrice record) {
        return pmsMemberPriceMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PmsMemberPrice> list) {
        return pmsMemberPriceMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PmsMemberPrice> list) {
        return pmsMemberPriceMapper.batchInsert(list);
    }

}
