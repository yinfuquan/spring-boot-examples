package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.UmsMemberTag;
public interface UmsMemberTagService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberTag record);

    int insertOrUpdate(UmsMemberTag record);

    int insertOrUpdateSelective(UmsMemberTag record);

    int insertSelective(UmsMemberTag record);

    UmsMemberTag selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberTag record);

    int updateByPrimaryKey(UmsMemberTag record);

    int updateBatch(List<UmsMemberTag> list);

    int batchInsert(List<UmsMemberTag> list);

}
