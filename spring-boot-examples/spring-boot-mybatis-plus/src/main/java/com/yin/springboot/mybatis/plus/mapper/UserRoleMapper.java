package com.yin.springboot.mybatis.plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yin.springboot.mybatis.plus.domain.UserRole;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleMapper extends BaseMapper<UserRole> {
    int updateBatch(List<UserRole> list);

    int batchInsert(@Param("list") List<UserRole> list);

    int insertOrUpdate(UserRole record);

    int insertOrUpdateSelective(UserRole record);
}