package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.SmsFlashPromotionLog;
public interface SmsFlashPromotionLogService{


    int deleteByPrimaryKey(Integer id);

    int insert(SmsFlashPromotionLog record);

    int insertOrUpdate(SmsFlashPromotionLog record);

    int insertOrUpdateSelective(SmsFlashPromotionLog record);

    int insertSelective(SmsFlashPromotionLog record);

    SmsFlashPromotionLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SmsFlashPromotionLog record);

    int updateByPrimaryKey(SmsFlashPromotionLog record);

    int updateBatch(List<SmsFlashPromotionLog> list);

    int batchInsert(List<SmsFlashPromotionLog> list);

}
