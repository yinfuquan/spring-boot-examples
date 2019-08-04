package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yin.springboot.mybatis.mapper.PmsBrandMapper;
import java.util.List;
import com.yin.springboot.mybatis.domain.PmsBrand;
import com.yin.springboot.mybatis.server.PmsBrandService;
@Service
public class PmsBrandServiceImpl implements PmsBrandService{

    @Resource
    private PmsBrandMapper pmsBrandMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsBrandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsBrand record) {
        return pmsBrandMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PmsBrand record) {
        return pmsBrandMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PmsBrand record) {
        return pmsBrandMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PmsBrand record) {
        return pmsBrandMapper.insertSelective(record);
    }

    @Override
    public PmsBrand selectByPrimaryKey(Long id) {
        return pmsBrandMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsBrand record) {
        return pmsBrandMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsBrand record) {
        return pmsBrandMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PmsBrand> list) {
        return pmsBrandMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PmsBrand> list) {
        return pmsBrandMapper.batchInsert(list);
    }

}
