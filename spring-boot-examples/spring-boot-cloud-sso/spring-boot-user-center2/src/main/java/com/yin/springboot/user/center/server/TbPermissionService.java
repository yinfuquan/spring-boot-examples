package com.yin.springboot.user.center.server;

import java.util.List;
import com.yin.springboot.user.center.domain.TbPermission;

public interface TbPermissionService {


    int updateBatch(List<TbPermission> list);

    int batchInsert(List<TbPermission> list);

    int insertOrUpdate(TbPermission record);

    int insertOrUpdateSelective(TbPermission record);
    List<TbPermission> selectByUserId(Long userId);
}

