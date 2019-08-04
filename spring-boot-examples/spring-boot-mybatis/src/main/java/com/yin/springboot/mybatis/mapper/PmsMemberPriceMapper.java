package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.PmsMemberPrice;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsMemberPriceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsMemberPrice record);

    int insertOrUpdate(PmsMemberPrice record);

    int insertOrUpdateSelective(PmsMemberPrice record);

    int insertSelective(PmsMemberPrice record);

    PmsMemberPrice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsMemberPrice record);

    int updateByPrimaryKey(PmsMemberPrice record);

    int updateBatch(List<PmsMemberPrice> list);

    int batchInsert(@Param("list") List<PmsMemberPrice> list);
}