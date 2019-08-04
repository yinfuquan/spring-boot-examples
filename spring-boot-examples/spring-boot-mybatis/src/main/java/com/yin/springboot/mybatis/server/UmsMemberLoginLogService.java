package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.UmsMemberLoginLog;
public interface UmsMemberLoginLogService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberLoginLog record);

    int insertOrUpdate(UmsMemberLoginLog record);

    int insertOrUpdateSelective(UmsMemberLoginLog record);

    int insertSelective(UmsMemberLoginLog record);

    UmsMemberLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberLoginLog record);

    int updateByPrimaryKey(UmsMemberLoginLog record);

    int updateBatch(List<UmsMemberLoginLog> list);

    int batchInsert(List<UmsMemberLoginLog> list);

}
