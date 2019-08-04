package com.yin.springboot.user.center.mapper;

import com.yin.springboot.user.center.domain.TbUserRole;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface TbUserRoleMapper extends Mapper<TbUserRole>, MySqlMapper<TbUserRole> {
    int updateBatch(List<TbUserRole> list);

    int batchInsert(@Param("list") List<TbUserRole> list);

    int insertOrUpdate(TbUserRole record);

    int insertOrUpdateSelective(TbUserRole record);
}