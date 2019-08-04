package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.OmsOrderReturnApply;
public interface OmsOrderReturnApplyService{


    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderReturnApply record);

    int insertOrUpdate(OmsOrderReturnApply record);

    int insertOrUpdateSelective(OmsOrderReturnApply record);

    int insertSelective(OmsOrderReturnApply record);

    OmsOrderReturnApply selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderReturnApply record);

    int updateByPrimaryKey(OmsOrderReturnApply record);

    int updateBatch(List<OmsOrderReturnApply> list);

    int batchInsert(List<OmsOrderReturnApply> list);

}
