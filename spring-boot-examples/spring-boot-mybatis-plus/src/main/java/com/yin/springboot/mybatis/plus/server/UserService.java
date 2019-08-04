package com.yin.springboot.mybatis.plus.server;

import java.util.List;
import com.yin.springboot.mybatis.plus.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
public interface UserService extends IService<User>{


    int updateBatch(List<User> list);

    int batchInsert(List<User> list);

    int insertOrUpdate(User record);

    int insertOrUpdateSelective(User record);

}
