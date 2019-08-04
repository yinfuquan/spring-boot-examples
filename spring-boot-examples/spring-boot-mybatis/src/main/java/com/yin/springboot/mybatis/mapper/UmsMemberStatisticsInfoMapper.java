package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.UmsMemberStatisticsInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberStatisticsInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberStatisticsInfo record);

    int insertOrUpdate(UmsMemberStatisticsInfo record);

    int insertOrUpdateSelective(UmsMemberStatisticsInfo record);

    int insertSelective(UmsMemberStatisticsInfo record);

    UmsMemberStatisticsInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberStatisticsInfo record);

    int updateByPrimaryKey(UmsMemberStatisticsInfo record);

    int updateBatch(List<UmsMemberStatisticsInfo> list);

    int batchInsert(@Param("list") List<UmsMemberStatisticsInfo> list);
}