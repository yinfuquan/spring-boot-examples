package com.yin.springboot.mybatis.plus.server;

import java.util.List;
import com.yin.springboot.mybatis.plus.domain.UserRole;
import com.baomidou.mybatisplus.extension.service.IService;
public interface UserRoleService extends IService<UserRole>{


    int updateBatch(List<UserRole> list);

    int batchInsert(List<UserRole> list);

    int insertOrUpdate(UserRole record);

    int insertOrUpdateSelective(UserRole record);

}
