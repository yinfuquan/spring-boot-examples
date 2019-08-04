package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.GroupUser;
public interface GroupUserService{


    int deleteByPrimaryKey(Integer id);

    int insert(GroupUser record);

    int insertOrUpdate(GroupUser record);

    int insertOrUpdateSelective(GroupUser record);

    int insertSelective(GroupUser record);

    GroupUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GroupUser record);

    int updateByPrimaryKey(GroupUser record);

    int updateBatch(List<GroupUser> list);

    int batchInsert(List<GroupUser> list);

}
