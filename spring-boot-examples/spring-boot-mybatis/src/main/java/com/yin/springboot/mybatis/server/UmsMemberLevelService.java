package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.UmsMemberLevel;
public interface UmsMemberLevelService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberLevel record);

    int insertOrUpdate(UmsMemberLevel record);

    int insertOrUpdateSelective(UmsMemberLevel record);

    int insertSelective(UmsMemberLevel record);

    UmsMemberLevel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberLevel record);

    int updateByPrimaryKey(UmsMemberLevel record);

    int updateBatch(List<UmsMemberLevel> list);

    int batchInsert(List<UmsMemberLevel> list);

}
