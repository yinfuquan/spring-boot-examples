package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.UmsMemberTask;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberTaskMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberTask record);

    int insertOrUpdate(UmsMemberTask record);

    int insertOrUpdateSelective(UmsMemberTask record);

    int insertSelective(UmsMemberTask record);

    UmsMemberTask selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberTask record);

    int updateByPrimaryKey(UmsMemberTask record);

    int updateBatch(List<UmsMemberTask> list);

    int batchInsert(@Param("list") List<UmsMemberTask> list);
}