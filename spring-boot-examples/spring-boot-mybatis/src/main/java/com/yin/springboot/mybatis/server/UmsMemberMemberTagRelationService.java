package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.UmsMemberMemberTagRelation;
public interface UmsMemberMemberTagRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberMemberTagRelation record);

    int insertOrUpdate(UmsMemberMemberTagRelation record);

    int insertOrUpdateSelective(UmsMemberMemberTagRelation record);

    int insertSelective(UmsMemberMemberTagRelation record);

    UmsMemberMemberTagRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberMemberTagRelation record);

    int updateByPrimaryKey(UmsMemberMemberTagRelation record);

    int updateBatch(List<UmsMemberMemberTagRelation> list);

    int batchInsert(List<UmsMemberMemberTagRelation> list);

}
