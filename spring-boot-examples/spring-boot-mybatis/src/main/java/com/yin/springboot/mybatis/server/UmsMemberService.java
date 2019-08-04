package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.UmsMember;
public interface UmsMemberService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsMember record);

    int insertOrUpdate(UmsMember record);

    int insertOrUpdateSelective(UmsMember record);

    int insertSelective(UmsMember record);

    UmsMember selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMember record);

    int updateByPrimaryKey(UmsMember record);

    int updateBatch(List<UmsMember> list);

    int batchInsert(List<UmsMember> list);

}
