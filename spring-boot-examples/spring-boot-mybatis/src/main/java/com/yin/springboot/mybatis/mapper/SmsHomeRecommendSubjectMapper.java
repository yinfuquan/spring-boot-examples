package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.SmsHomeRecommendSubject;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsHomeRecommendSubjectMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeRecommendSubject record);

    int insertOrUpdate(SmsHomeRecommendSubject record);

    int insertOrUpdateSelective(SmsHomeRecommendSubject record);

    int insertSelective(SmsHomeRecommendSubject record);

    SmsHomeRecommendSubject selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeRecommendSubject record);

    int updateByPrimaryKey(SmsHomeRecommendSubject record);

    int updateBatch(List<SmsHomeRecommendSubject> list);

    int batchInsert(@Param("list") List<SmsHomeRecommendSubject> list);
}