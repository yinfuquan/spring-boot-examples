package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.SmsFlashPromotionSession;
public interface SmsFlashPromotionSessionService{


    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotionSession record);

    int insertOrUpdate(SmsFlashPromotionSession record);

    int insertOrUpdateSelective(SmsFlashPromotionSession record);

    int insertSelective(SmsFlashPromotionSession record);

    SmsFlashPromotionSession selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsFlashPromotionSession record);

    int updateByPrimaryKey(SmsFlashPromotionSession record);

    int updateBatch(List<SmsFlashPromotionSession> list);

    int batchInsert(List<SmsFlashPromotionSession> list);

}
