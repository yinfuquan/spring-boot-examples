package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.GroupUser;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GroupUser record);

    int insertOrUpdate(GroupUser record);

    int insertOrUpdateSelective(GroupUser record);

    int insertSelective(GroupUser record);

    GroupUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GroupUser record);

    int updateByPrimaryKey(GroupUser record);

    int updateBatch(List<GroupUser> list);

    int batchInsert(@Param("list") List<GroupUser> list);
}