package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.SmsHomeRecommendSubject;
public interface SmsHomeRecommendSubjectService{


    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeRecommendSubject record);

    int insertOrUpdate(SmsHomeRecommendSubject record);

    int insertOrUpdateSelective(SmsHomeRecommendSubject record);

    int insertSelective(SmsHomeRecommendSubject record);

    SmsHomeRecommendSubject selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeRecommendSubject record);

    int updateByPrimaryKey(SmsHomeRecommendSubject record);

    int updateBatch(List<SmsHomeRecommendSubject> list);

    int batchInsert(List<SmsHomeRecommendSubject> list);

}
