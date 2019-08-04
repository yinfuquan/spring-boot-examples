package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yin.springboot.mybatis.domain.OmsCompanyAddress;
import java.util.List;
import com.yin.springboot.mybatis.mapper.OmsCompanyAddressMapper;
import com.yin.springboot.mybatis.server.OmsCompanyAddressService;
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService{

    @Resource
    private OmsCompanyAddressMapper omsCompanyAddressMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return omsCompanyAddressMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OmsCompanyAddress record) {
        return omsCompanyAddressMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(OmsCompanyAddress record) {
        return omsCompanyAddressMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(OmsCompanyAddress record) {
        return omsCompanyAddressMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(OmsCompanyAddress record) {
        return omsCompanyAddressMapper.insertSelective(record);
    }

    @Override
    public OmsCompanyAddress selectByPrimaryKey(Long id) {
        return omsCompanyAddressMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OmsCompanyAddress record) {
        return omsCompanyAddressMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OmsCompanyAddress record) {
        return omsCompanyAddressMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<OmsCompanyAddress> list) {
        return omsCompanyAddressMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<OmsCompanyAddress> list) {
        return omsCompanyAddressMapper.batchInsert(list);
    }

}
