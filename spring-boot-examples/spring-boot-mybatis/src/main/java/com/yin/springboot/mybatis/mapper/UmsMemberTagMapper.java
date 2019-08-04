package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.UmsMemberTag;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberTagMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberTag record);

    int insertOrUpdate(UmsMemberTag record);

    int insertOrUpdateSelective(UmsMemberTag record);

    int insertSelective(UmsMemberTag record);

    UmsMemberTag selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberTag record);

    int updateByPrimaryKey(UmsMemberTag record);

    int updateBatch(List<UmsMemberTag> list);

    int batchInsert(@Param("list") List<UmsMemberTag> list);
}