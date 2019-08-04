package com.yin.springboot.mybatis.plus.server;

import com.yin.springboot.mybatis.plus.domain.Permission;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface PermissionService extends IService<Permission>{


    int updateBatch(List<Permission> list);

    int batchInsert(List<Permission> list);

    int insertOrUpdate(Permission record);

    int insertOrUpdateSelective(Permission record);

}
