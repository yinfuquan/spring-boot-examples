package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.CmsMemberReport;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsMemberReportMapper {
    int insert(CmsMemberReport record);

    int insertOrUpdate(CmsMemberReport record);

    int insertOrUpdateSelective(CmsMemberReport record);

    int insertSelective(CmsMemberReport record);

    int batchInsert(@Param("list") List<CmsMemberReport> list);
}