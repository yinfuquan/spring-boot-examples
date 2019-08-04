package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.OmsOrderReturnReason;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderReturnReasonMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderReturnReason record);

    int insertOrUpdate(OmsOrderReturnReason record);

    int insertOrUpdateSelective(OmsOrderReturnReason record);

    int insertSelective(OmsOrderReturnReason record);

    OmsOrderReturnReason selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderReturnReason record);

    int updateByPrimaryKey(OmsOrderReturnReason record);

    int updateBatch(List<OmsOrderReturnReason> list);

    int batchInsert(@Param("list") List<OmsOrderReturnReason> list);
}