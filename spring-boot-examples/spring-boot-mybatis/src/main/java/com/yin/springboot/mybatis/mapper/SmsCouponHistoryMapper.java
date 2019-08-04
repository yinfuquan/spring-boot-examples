package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.SmsCouponHistory;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsCouponHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponHistory record);

    int insertOrUpdate(SmsCouponHistory record);

    int insertOrUpdateSelective(SmsCouponHistory record);

    int insertSelective(SmsCouponHistory record);

    SmsCouponHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsCouponHistory record);

    int updateByPrimaryKey(SmsCouponHistory record);

    int updateBatch(List<SmsCouponHistory> list);

    int batchInsert(@Param("list") List<SmsCouponHistory> list);
}