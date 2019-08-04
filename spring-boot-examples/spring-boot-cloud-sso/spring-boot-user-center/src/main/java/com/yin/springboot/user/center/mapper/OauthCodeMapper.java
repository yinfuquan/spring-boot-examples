package com.yin.springboot.user.center.mapper;

import com.yin.springboot.user.center.domain.OauthCode;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface OauthCodeMapper extends Mapper<OauthCode>, MySqlMapper<OauthCode> {
    int batchInsert(@Param("list") List<OauthCode> list);

    int insertOrUpdate(OauthCode record);

    int insertOrUpdateSelective(OauthCode record);
}