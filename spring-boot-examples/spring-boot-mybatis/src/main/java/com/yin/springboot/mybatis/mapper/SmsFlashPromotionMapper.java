package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.SmsFlashPromotion;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsFlashPromotionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotion record);

    int insertOrUpdate(SmsFlashPromotion record);

    int insertOrUpdateSelective(SmsFlashPromotion record);

    int insertSelective(SmsFlashPromotion record);

    SmsFlashPromotion selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsFlashPromotion record);

    int updateByPrimaryKey(SmsFlashPromotion record);

    int updateBatch(List<SmsFlashPromotion> list);

    int batchInsert(@Param("list") List<SmsFlashPromotion> list);
}