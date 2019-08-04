package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.SmsFlashPromotionProductRelation;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsFlashPromotionProductRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotionProductRelation record);

    int insertOrUpdate(SmsFlashPromotionProductRelation record);

    int insertOrUpdateSelective(SmsFlashPromotionProductRelation record);

    int insertSelective(SmsFlashPromotionProductRelation record);

    SmsFlashPromotionProductRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsFlashPromotionProductRelation record);

    int updateByPrimaryKey(SmsFlashPromotionProductRelation record);

    int updateBatch(List<SmsFlashPromotionProductRelation> list);

    int batchInsert(@Param("list") List<SmsFlashPromotionProductRelation> list);
}