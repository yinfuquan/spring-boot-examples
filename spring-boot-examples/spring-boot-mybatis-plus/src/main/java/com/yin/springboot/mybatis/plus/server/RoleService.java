package com.yin.springboot.mybatis.plus.server;

import com.yin.springboot.mybatis.plus.domain.Role;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface RoleService extends IService<Role>{


    int updateBatch(List<Role> list);

    int batchInsert(List<Role> list);

    int insertOrUpdate(Role record);

    int insertOrUpdateSelective(Role record);

}
