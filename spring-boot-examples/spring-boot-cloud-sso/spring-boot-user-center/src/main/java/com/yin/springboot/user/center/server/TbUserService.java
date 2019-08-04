package com.yin.springboot.user.center.server;

import com.yin.springboot.user.center.domain.TbUser;
import java.util.List;

public interface TbUserService {


    int updateBatch(List<TbUser> list);

    int batchInsert(List<TbUser> list);

    int insertOrUpdate(TbUser record);

    int insertOrUpdateSelective(TbUser record);
    TbUser getByUsername(String username);

}

