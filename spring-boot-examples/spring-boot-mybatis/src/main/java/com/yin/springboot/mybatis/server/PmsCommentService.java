package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.PmsComment;
public interface PmsCommentService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsComment record);

    int insertOrUpdate(PmsComment record);

    int insertOrUpdateSelective(PmsComment record);

    int insertSelective(PmsComment record);

    PmsComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsComment record);

    int updateByPrimaryKey(PmsComment record);

    int updateBatch(List<PmsComment> list);

    int batchInsert(List<PmsComment> list);

}
