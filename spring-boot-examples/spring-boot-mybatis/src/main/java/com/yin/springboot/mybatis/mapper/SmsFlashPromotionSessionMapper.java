package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.SmsFlashPromotionSession;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsFlashPromotionSessionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotionSession record);

    int insertOrUpdate(SmsFlashPromotionSession record);

    int insertOrUpdateSelective(SmsFlashPromotionSession record);

    int insertSelective(SmsFlashPromotionSession record);

    SmsFlashPromotionSession selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsFlashPromotionSession record);

    int updateByPrimaryKey(SmsFlashPromotionSession record);

    int updateBatch(List<SmsFlashPromotionSession> list);

    int batchInsert(@Param("list") List<SmsFlashPromotionSession> list);
}