package com.yin.springboot.mybatis.server;

import com.yin.springboot.mybatis.domain.UmsMemberTask;
import java.util.List;
public interface UmsMemberTaskService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberTask record);

    int insertOrUpdate(UmsMemberTask record);

    int insertOrUpdateSelective(UmsMemberTask record);

    int insertSelective(UmsMemberTask record);

    UmsMemberTask selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberTask record);

    int updateByPrimaryKey(UmsMemberTask record);

    int updateBatch(List<UmsMemberTask> list);

    int batchInsert(List<UmsMemberTask> list);

}
