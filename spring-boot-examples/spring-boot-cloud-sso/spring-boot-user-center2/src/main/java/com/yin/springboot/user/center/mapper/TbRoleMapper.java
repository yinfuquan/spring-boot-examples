package com.yin.springboot.user.center.mapper;

import com.yin.springboot.user.center.domain.TbRole;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface TbRoleMapper extends Mapper<TbRole>, MySqlMapper<TbRole> {
    int updateBatch(List<TbRole> list);

    int batchInsert(@Param("list") List<TbRole> list);

    int insertOrUpdate(TbRole record);

    int insertOrUpdateSelective(TbRole record);
}