package com.yin.springboot.user.center.mapper;

import com.yin.springboot.user.center.domain.TbUser;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface TbUserMapper extends Mapper<TbUser>, MySqlMapper<TbUser> {
    int updateBatch(List<TbUser> list);

    int batchInsert(@Param("list") List<TbUser> list);

    int insertOrUpdate(TbUser record);

    int insertOrUpdateSelective(TbUser record);

    TbUser getByUsername(String username);
}