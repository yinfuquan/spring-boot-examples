package com.yin.springboot.mybatis.plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yin.springboot.mybatis.plus.domain.RolePermission;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePermissionMapper extends BaseMapper<RolePermission> {
    int updateBatch(List<RolePermission> list);

    int batchInsert(@Param("list") List<RolePermission> list);

    int insertOrUpdate(RolePermission record);

    int insertOrUpdateSelective(RolePermission record);
}