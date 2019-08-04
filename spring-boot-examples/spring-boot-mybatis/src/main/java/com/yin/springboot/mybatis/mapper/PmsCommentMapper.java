package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.PmsComment;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsComment record);

    int insertOrUpdate(PmsComment record);

    int insertOrUpdateSelective(PmsComment record);

    int insertSelective(PmsComment record);

    PmsComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsComment record);

    int updateByPrimaryKey(PmsComment record);

    int updateBatch(List<PmsComment> list);

    int batchInsert(@Param("list") List<PmsComment> list);
}