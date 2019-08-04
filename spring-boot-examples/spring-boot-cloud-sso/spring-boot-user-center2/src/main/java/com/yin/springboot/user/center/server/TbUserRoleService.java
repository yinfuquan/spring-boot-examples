package com.yin.springboot.user.center.server;

import java.util.List;
import com.yin.springboot.user.center.domain.TbUserRole;

public interface TbUserRoleService {


    int updateBatch(List<TbUserRole> list);

    int batchInsert(List<TbUserRole> list);

    int insertOrUpdate(TbUserRole record);

    int insertOrUpdateSelective(TbUserRole record);

}

