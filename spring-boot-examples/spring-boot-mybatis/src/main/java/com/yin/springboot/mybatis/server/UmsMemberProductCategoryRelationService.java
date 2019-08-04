package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.UmsMemberProductCategoryRelation;
public interface UmsMemberProductCategoryRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberProductCategoryRelation record);

    int insertOrUpdate(UmsMemberProductCategoryRelation record);

    int insertOrUpdateSelective(UmsMemberProductCategoryRelation record);

    int insertSelective(UmsMemberProductCategoryRelation record);

    UmsMemberProductCategoryRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberProductCategoryRelation record);

    int updateByPrimaryKey(UmsMemberProductCategoryRelation record);

    int updateBatch(List<UmsMemberProductCategoryRelation> list);

    int batchInsert(List<UmsMemberProductCategoryRelation> list);

}
