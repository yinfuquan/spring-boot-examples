package com.yin.springboot.user.center.mapper;

import com.yin.springboot.user.center.domain.TbPermission;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface TbPermissionMapper extends Mapper<TbPermission>, MySqlMapper<TbPermission> {
    int updateBatch(List<TbPermission> list);

    int batchInsert(@Param("list") List<TbPermission> list);

    int insertOrUpdate(TbPermission record);

    int insertOrUpdateSelective(TbPermission record);
    List<TbPermission> selectByUserId(@Param("userId") Long userId);
}