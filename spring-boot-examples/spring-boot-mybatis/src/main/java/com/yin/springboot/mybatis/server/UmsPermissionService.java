package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.UmsPermission;
public interface UmsPermissionService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsPermission record);

    int insertOrUpdate(UmsPermission record);

    int insertOrUpdateSelective(UmsPermission record);

    int insertSelective(UmsPermission record);

    UmsPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsPermission record);

    int updateByPrimaryKey(UmsPermission record);

    int updateBatch(List<UmsPermission> list);

    int batchInsert(List<UmsPermission> list);

}
