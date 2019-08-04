package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.SmsFlashPromotion;
public interface SmsFlashPromotionService{


    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotion record);

    int insertOrUpdate(SmsFlashPromotion record);

    int insertOrUpdateSelective(SmsFlashPromotion record);

    int insertSelective(SmsFlashPromotion record);

    SmsFlashPromotion selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsFlashPromotion record);

    int updateByPrimaryKey(SmsFlashPromotion record);

    int updateBatch(List<SmsFlashPromotion> list);

    int batchInsert(List<SmsFlashPromotion> list);

}
