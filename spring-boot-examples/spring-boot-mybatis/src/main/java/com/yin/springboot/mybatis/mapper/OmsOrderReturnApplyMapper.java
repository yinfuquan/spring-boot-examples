package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.OmsOrderReturnApply;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderReturnApplyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderReturnApply record);

    int insertOrUpdate(OmsOrderReturnApply record);

    int insertOrUpdateSelective(OmsOrderReturnApply record);

    int insertSelective(OmsOrderReturnApply record);

    OmsOrderReturnApply selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderReturnApply record);

    int updateByPrimaryKey(OmsOrderReturnApply record);

    int updateBatch(List<OmsOrderReturnApply> list);

    int batchInsert(@Param("list") List<OmsOrderReturnApply> list);
}