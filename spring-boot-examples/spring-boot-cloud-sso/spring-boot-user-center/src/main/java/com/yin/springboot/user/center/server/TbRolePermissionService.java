package com.yin.springboot.user.center.server;

import com.yin.springboot.user.center.domain.TbRolePermission;
import java.util.List;

public interface TbRolePermissionService {


    int updateBatch(List<TbRolePermission> list);

    int batchInsert(List<TbRolePermission> list);

    int insertOrUpdate(TbRolePermission record);

    int insertOrUpdateSelective(TbRolePermission record);

}

