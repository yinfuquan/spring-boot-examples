package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.SmsHomeRecommendProduct;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsHomeRecommendProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeRecommendProduct record);

    int insertOrUpdate(SmsHomeRecommendProduct record);

    int insertOrUpdateSelective(SmsHomeRecommendProduct record);

    int insertSelective(SmsHomeRecommendProduct record);

    SmsHomeRecommendProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeRecommendProduct record);

    int updateByPrimaryKey(SmsHomeRecommendProduct record);

    int updateBatch(List<SmsHomeRecommendProduct> list);

    int batchInsert(@Param("list") List<SmsHomeRecommendProduct> list);
}