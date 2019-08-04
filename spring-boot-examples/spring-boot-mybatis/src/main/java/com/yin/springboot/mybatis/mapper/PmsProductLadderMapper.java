package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.PmsProductLadder;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductLadderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductLadder record);

    int insertOrUpdate(PmsProductLadder record);

    int insertOrUpdateSelective(PmsProductLadder record);

    int insertSelective(PmsProductLadder record);

    PmsProductLadder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductLadder record);

    int updateByPrimaryKey(PmsProductLadder record);

    int updateBatch(List<PmsProductLadder> list);

    int batchInsert(@Param("list") List<PmsProductLadder> list);
}