package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.UmsMember;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMember record);

    int insertOrUpdate(UmsMember record);

    int insertOrUpdateSelective(UmsMember record);

    int insertSelective(UmsMember record);

    UmsMember selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMember record);

    int updateByPrimaryKey(UmsMember record);

    int updateBatch(List<UmsMember> list);

    int batchInsert(@Param("list") List<UmsMember> list);
}