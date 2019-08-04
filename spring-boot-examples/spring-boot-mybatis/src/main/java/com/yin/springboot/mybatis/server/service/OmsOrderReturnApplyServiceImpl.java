package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.OmsOrderReturnApplyMapper;
import com.yin.springboot.mybatis.domain.OmsOrderReturnApply;
import com.yin.springboot.mybatis.server.OmsOrderReturnApplyService;
@Service
public class OmsOrderReturnApplyServiceImpl implements OmsOrderReturnApplyService{

    @Resource
    private OmsOrderReturnApplyMapper omsOrderReturnApplyMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return omsOrderReturnApplyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OmsOrderReturnApply record) {
        return omsOrderReturnApplyMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(OmsOrderReturnApply record) {
        return omsOrderReturnApplyMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(OmsOrderReturnApply record) {
        return omsOrderReturnApplyMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(OmsOrderReturnApply record) {
        return omsOrderReturnApplyMapper.insertSelective(record);
    }

    @Override
    public OmsOrderReturnApply selectByPrimaryKey(Long id) {
        return omsOrderReturnApplyMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OmsOrderReturnApply record) {
        return omsOrderReturnApplyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OmsOrderReturnApply record) {
        return omsOrderReturnApplyMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<OmsOrderReturnApply> list) {
        return omsOrderReturnApplyMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<OmsOrderReturnApply> list) {
        return omsOrderReturnApplyMapper.batchInsert(list);
    }

}
