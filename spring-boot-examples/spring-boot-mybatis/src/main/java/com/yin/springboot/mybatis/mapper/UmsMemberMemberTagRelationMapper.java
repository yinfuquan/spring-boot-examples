package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.UmsMemberMemberTagRelation;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberMemberTagRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberMemberTagRelation record);

    int insertOrUpdate(UmsMemberMemberTagRelation record);

    int insertOrUpdateSelective(UmsMemberMemberTagRelation record);

    int insertSelective(UmsMemberMemberTagRelation record);

    UmsMemberMemberTagRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberMemberTagRelation record);

    int updateByPrimaryKey(UmsMemberMemberTagRelation record);

    int updateBatch(List<UmsMemberMemberTagRelation> list);

    int batchInsert(@Param("list") List<UmsMemberMemberTagRelation> list);
}