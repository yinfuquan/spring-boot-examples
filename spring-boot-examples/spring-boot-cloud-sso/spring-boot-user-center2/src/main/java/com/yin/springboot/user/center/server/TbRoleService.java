package com.yin.springboot.user.center.server;

import com.yin.springboot.user.center.domain.TbRole;
import java.util.List;

public interface TbRoleService {


    int updateBatch(List<TbRole> list);

    int batchInsert(List<TbRole> list);

    int insertOrUpdate(TbRole record);

    int insertOrUpdateSelective(TbRole record);

}

