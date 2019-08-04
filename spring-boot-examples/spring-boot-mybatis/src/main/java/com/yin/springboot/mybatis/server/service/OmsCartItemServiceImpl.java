package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yin.springboot.mybatis.mapper.OmsCartItemMapper;
import java.util.List;
import com.yin.springboot.mybatis.domain.OmsCartItem;
import com.yin.springboot.mybatis.server.OmsCartItemService;
@Service
public class OmsCartItemServiceImpl implements OmsCartItemService{

    @Resource
    private OmsCartItemMapper omsCartItemMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return omsCartItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OmsCartItem record) {
        return omsCartItemMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(OmsCartItem record) {
        return omsCartItemMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(OmsCartItem record) {
        return omsCartItemMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(OmsCartItem record) {
        return omsCartItemMapper.insertSelective(record);
    }

    @Override
    public OmsCartItem selectByPrimaryKey(Long id) {
        return omsCartItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OmsCartItem record) {
        return omsCartItemMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OmsCartItem record) {
        return omsCartItemMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<OmsCartItem> list) {
        return omsCartItemMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<OmsCartItem> list) {
        return omsCartItemMapper.batchInsert(list);
    }

}
