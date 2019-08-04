package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yin.springboot.mybatis.mapper.PmsProductAttributeValueMapper;
import java.util.List;
import com.yin.springboot.mybatis.domain.PmsProductAttributeValue;
import com.yin.springboot.mybatis.server.PmsProductAttributeValueService;
@Service
public class PmsProductAttributeValueServiceImpl implements PmsProductAttributeValueService{

    @Resource
    private PmsProductAttributeValueMapper pmsProductAttributeValueMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsProductAttributeValueMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsProductAttributeValue record) {
        return pmsProductAttributeValueMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PmsProductAttributeValue record) {
        return pmsProductAttributeValueMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PmsProductAttributeValue record) {
        return pmsProductAttributeValueMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PmsProductAttributeValue record) {
        return pmsProductAttributeValueMapper.insertSelective(record);
    }

    @Override
    public PmsProductAttributeValue selectByPrimaryKey(Long id) {
        return pmsProductAttributeValueMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsProductAttributeValue record) {
        return pmsProductAttributeValueMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsProductAttributeValue record) {
        return pmsProductAttributeValueMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PmsProductAttributeValue> list) {
        return pmsProductAttributeValueMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PmsProductAttributeValue> list) {
        return pmsProductAttributeValueMapper.batchInsert(list);
    }

}
