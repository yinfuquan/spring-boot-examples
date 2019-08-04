package com.yin.springboot.mybatis.plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yin.springboot.mybatis.plus.domain.Permission;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionMapper extends BaseMapper<Permission> {
    int updateBatch(List<Permission> list);

    int batchInsert(@Param("list") List<Permission> list);

    int insertOrUpdate(Permission record);

    int insertOrUpdateSelective(Permission record);
}