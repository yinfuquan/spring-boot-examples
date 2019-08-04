package com.yin.springboot.mybatis.plus.server;

import java.util.List;
import com.yin.springboot.mybatis.plus.domain.RolePermission;
import com.baomidou.mybatisplus.extension.service.IService;
public interface RolePermissionService extends IService<RolePermission>{


    int updateBatch(List<RolePermission> list);

    int batchInsert(List<RolePermission> list);

    int insertOrUpdate(RolePermission record);

    int insertOrUpdateSelective(RolePermission record);

}
