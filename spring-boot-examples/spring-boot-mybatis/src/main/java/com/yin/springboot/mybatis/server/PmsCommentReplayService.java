package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.PmsCommentReplay;
public interface PmsCommentReplayService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsCommentReplay record);

    int insertOrUpdate(PmsCommentReplay record);

    int insertOrUpdateSelective(PmsCommentReplay record);

    int insertSelective(PmsCommentReplay record);

    PmsCommentReplay selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsCommentReplay record);

    int updateByPrimaryKey(PmsCommentReplay record);

    int updateBatch(List<PmsCommentReplay> list);

    int batchInsert(List<PmsCommentReplay> list);

}
