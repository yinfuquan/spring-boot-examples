package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.SmsFlashPromotionProductRelation;
public interface SmsFlashPromotionProductRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotionProductRelation record);

    int insertOrUpdate(SmsFlashPromotionProductRelation record);

    int insertOrUpdateSelective(SmsFlashPromotionProductRelation record);

    int insertSelective(SmsFlashPromotionProductRelation record);

    SmsFlashPromotionProductRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsFlashPromotionProductRelation record);

    int updateByPrimaryKey(SmsFlashPromotionProductRelation record);

    int updateBatch(List<SmsFlashPromotionProductRelation> list);

    int batchInsert(List<SmsFlashPromotionProductRelation> list);

}
