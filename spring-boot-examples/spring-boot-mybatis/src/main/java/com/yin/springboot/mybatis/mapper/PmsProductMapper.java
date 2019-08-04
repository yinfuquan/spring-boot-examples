package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.PmsProduct;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProduct record);

    int insertOrUpdate(PmsProduct record);

    int insertOrUpdateSelective(PmsProduct record);

    int insertSelective(PmsProduct record);

    PmsProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProduct record);

    int updateByPrimaryKey(PmsProduct record);

    int updateBatch(List<PmsProduct> list);

    int batchInsert(@Param("list") List<PmsProduct> list);
}