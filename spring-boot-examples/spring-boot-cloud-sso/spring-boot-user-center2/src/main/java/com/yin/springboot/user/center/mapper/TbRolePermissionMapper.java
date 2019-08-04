package com.yin.springboot.user.center.mapper;

import com.yin.springboot.user.center.domain.TbRolePermission;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface TbRolePermissionMapper extends Mapper<TbRolePermission>, MySqlMapper<TbRolePermission> {
    int updateBatch(List<TbRolePermission> list);

    int batchInsert(@Param("list") List<TbRolePermission> list);

    int insertOrUpdate(TbRolePermission record);

    int insertOrUpdateSelective(TbRolePermission record);
}