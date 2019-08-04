package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.PmsProductLadder;
public interface PmsProductLadderService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsProductLadder record);

    int insertOrUpdate(PmsProductLadder record);

    int insertOrUpdateSelective(PmsProductLadder record);

    int insertSelective(PmsProductLadder record);

    PmsProductLadder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductLadder record);

    int updateByPrimaryKey(PmsProductLadder record);

    int updateBatch(List<PmsProductLadder> list);

    int batchInsert(List<PmsProductLadder> list);

}
