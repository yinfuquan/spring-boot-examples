package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.UmsMemberStatisticsInfo;
public interface UmsMemberStatisticsInfoService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberStatisticsInfo record);

    int insertOrUpdate(UmsMemberStatisticsInfo record);

    int insertOrUpdateSelective(UmsMemberStatisticsInfo record);

    int insertSelective(UmsMemberStatisticsInfo record);

    UmsMemberStatisticsInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberStatisticsInfo record);

    int updateByPrimaryKey(UmsMemberStatisticsInfo record);

    int updateBatch(List<UmsMemberStatisticsInfo> list);

    int batchInsert(List<UmsMemberStatisticsInfo> list);

}
