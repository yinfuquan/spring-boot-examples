package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.SmsFlashPromotionLog;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsFlashPromotionLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmsFlashPromotionLog record);

    int insertOrUpdate(SmsFlashPromotionLog record);

    int insertOrUpdateSelective(SmsFlashPromotionLog record);

    int insertSelective(SmsFlashPromotionLog record);

    SmsFlashPromotionLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SmsFlashPromotionLog record);

    int updateByPrimaryKey(SmsFlashPromotionLog record);

    int updateBatch(List<SmsFlashPromotionLog> list);

    int batchInsert(@Param("list") List<SmsFlashPromotionLog> list);
}