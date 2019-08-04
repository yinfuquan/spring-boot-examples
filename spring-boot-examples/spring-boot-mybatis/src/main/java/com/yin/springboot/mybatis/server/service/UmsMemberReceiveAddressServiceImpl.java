package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yin.springboot.mybatis.domain.UmsMemberReceiveAddress;
import java.util.List;
import com.yin.springboot.mybatis.mapper.UmsMemberReceiveAddressMapper;
import com.yin.springboot.mybatis.server.UmsMemberReceiveAddressService;
@Service
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService{

    @Resource
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsMemberReceiveAddressMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsMemberReceiveAddress record) {
        return umsMemberReceiveAddressMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(UmsMemberReceiveAddress record) {
        return umsMemberReceiveAddressMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UmsMemberReceiveAddress record) {
        return umsMemberReceiveAddressMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(UmsMemberReceiveAddress record) {
        return umsMemberReceiveAddressMapper.insertSelective(record);
    }

    @Override
    public UmsMemberReceiveAddress selectByPrimaryKey(Long id) {
        return umsMemberReceiveAddressMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsMemberReceiveAddress record) {
        return umsMemberReceiveAddressMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsMemberReceiveAddress record) {
        return umsMemberReceiveAddressMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<UmsMemberReceiveAddress> list) {
        return umsMemberReceiveAddressMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<UmsMemberReceiveAddress> list) {
        return umsMemberReceiveAddressMapper.batchInsert(list);
    }

}
