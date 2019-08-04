package com.yin.springboot.user.center.mapper;

import com.yin.springboot.user.center.domain.OauthRefreshToken;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface OauthRefreshTokenMapper extends Mapper<OauthRefreshToken>, MySqlMapper<OauthRefreshToken> {
    int batchInsert(@Param("list") List<OauthRefreshToken> list);

    int insertOrUpdate(OauthRefreshToken record);

    int insertOrUpdateSelective(OauthRefreshToken record);
}