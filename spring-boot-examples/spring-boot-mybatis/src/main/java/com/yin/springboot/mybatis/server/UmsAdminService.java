package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.UmsAdmin;
public interface UmsAdminService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsAdmin record);

    int insertOrUpdate(UmsAdmin record);

    int insertOrUpdateSelective(UmsAdmin record);

    int insertSelective(UmsAdmin record);

    UmsAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdmin record);

    int updateByPrimaryKey(UmsAdmin record);

    int updateBatch(List<UmsAdmin> list);

    int batchInsert(List<UmsAdmin> list);

}
