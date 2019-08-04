package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.UmsRole;
public interface UmsRoleService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsRole record);

    int insertOrUpdate(UmsRole record);

    int insertOrUpdateSelective(UmsRole record);

    int insertSelective(UmsRole record);

    UmsRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsRole record);

    int updateByPrimaryKey(UmsRole record);

    int updateBatch(List<UmsRole> list);

    int batchInsert(List<UmsRole> list);

}
