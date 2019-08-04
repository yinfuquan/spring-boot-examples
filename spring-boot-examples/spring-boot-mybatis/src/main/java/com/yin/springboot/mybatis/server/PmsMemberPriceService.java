package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.PmsMemberPrice;
public interface PmsMemberPriceService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsMemberPrice record);

    int insertOrUpdate(PmsMemberPrice record);

    int insertOrUpdateSelective(PmsMemberPrice record);

    int insertSelective(PmsMemberPrice record);

    PmsMemberPrice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsMemberPrice record);

    int updateByPrimaryKey(PmsMemberPrice record);

    int updateBatch(List<PmsMemberPrice> list);

    int batchInsert(List<PmsMemberPrice> list);

}
