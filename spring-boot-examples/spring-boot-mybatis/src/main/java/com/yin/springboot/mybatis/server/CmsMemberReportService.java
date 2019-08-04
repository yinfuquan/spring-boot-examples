package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.CmsMemberReport;
public interface CmsMemberReportService{


    int insert(CmsMemberReport record);

    int insertOrUpdate(CmsMemberReport record);

    int insertOrUpdateSelective(CmsMemberReport record);

    int insertSelective(CmsMemberReport record);

    int batchInsert(List<CmsMemberReport> list);

}
