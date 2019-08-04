package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.UmsMemberStatisticsInfoMapper;
import com.yin.springboot.mybatis.domain.UmsMemberStatisticsInfo;
import com.yin.springboot.mybatis.server.UmsMemberStatisticsInfoService;
@Service
public class UmsMemberStatisticsInfoServiceImpl implements UmsMemberStatisticsInfoService{

    @Resource
    private UmsMemberStatisticsInfoMapper umsMemberStatisticsInfoMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsMemberStatisticsInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsMemberStatisticsInfo record) {
        return umsMemberStatisticsInfoMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(UmsMemberStatisticsInfo record) {
        return umsMemberStatisticsInfoMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UmsMemberStatisticsInfo record) {
        return umsMemberStatisticsInfoMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(UmsMemberStatisticsInfo record) {
        return umsMemberStatisticsInfoMapper.insertSelective(record);
    }

    @Override
    public UmsMemberStatisticsInfo selectByPrimaryKey(Long id) {
        return umsMemberStatisticsInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsMemberStatisticsInfo record) {
        return umsMemberStatisticsInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsMemberStatisticsInfo record) {
        return umsMemberStatisticsInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<UmsMemberStatisticsInfo> list) {
        return umsMemberStatisticsInfoMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<UmsMemberStatisticsInfo> list) {
        return umsMemberStatisticsInfoMapper.batchInsert(list);
    }

}
