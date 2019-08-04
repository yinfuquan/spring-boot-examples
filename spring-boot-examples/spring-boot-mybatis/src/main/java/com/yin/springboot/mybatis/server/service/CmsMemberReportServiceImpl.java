package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.CmsMemberReportMapper;
import com.yin.springboot.mybatis.domain.CmsMemberReport;
import com.yin.springboot.mybatis.server.CmsMemberReportService;
@Service
public class CmsMemberReportServiceImpl implements CmsMemberReportService{

    @Resource
    private CmsMemberReportMapper cmsMemberReportMapper;

    @Override
    public int insert(CmsMemberReport record) {
        return cmsMemberReportMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(CmsMemberReport record) {
        return cmsMemberReportMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CmsMemberReport record) {
        return cmsMemberReportMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(CmsMemberReport record) {
        return cmsMemberReportMapper.insertSelective(record);
    }

    @Override
    public int batchInsert(List<CmsMemberReport> list) {
        return cmsMemberReportMapper.batchInsert(list);
    }

}
