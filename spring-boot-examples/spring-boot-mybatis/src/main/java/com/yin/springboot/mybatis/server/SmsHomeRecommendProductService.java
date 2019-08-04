package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.SmsHomeRecommendProduct;
public interface SmsHomeRecommendProductService{


    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeRecommendProduct record);

    int insertOrUpdate(SmsHomeRecommendProduct record);

    int insertOrUpdateSelective(SmsHomeRecommendProduct record);

    int insertSelective(SmsHomeRecommendProduct record);

    SmsHomeRecommendProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeRecommendProduct record);

    int updateByPrimaryKey(SmsHomeRecommendProduct record);

    int updateBatch(List<SmsHomeRecommendProduct> list);

    int batchInsert(List<SmsHomeRecommendProduct> list);

}
