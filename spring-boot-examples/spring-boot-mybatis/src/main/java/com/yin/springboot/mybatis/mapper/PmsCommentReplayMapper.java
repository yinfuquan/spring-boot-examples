package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.PmsCommentReplay;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsCommentReplayMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsCommentReplay record);

    int insertOrUpdate(PmsCommentReplay record);

    int insertOrUpdateSelective(PmsCommentReplay record);

    int insertSelective(PmsCommentReplay record);

    PmsCommentReplay selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsCommentReplay record);

    int updateByPrimaryKey(PmsCommentReplay record);

    int updateBatch(List<PmsCommentReplay> list);

    int batchInsert(@Param("list") List<PmsCommentReplay> list);
}