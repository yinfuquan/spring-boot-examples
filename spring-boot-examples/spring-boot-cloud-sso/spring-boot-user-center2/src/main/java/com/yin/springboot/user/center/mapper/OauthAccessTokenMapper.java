package com.yin.springboot.user.center.mapper;

import com.yin.springboot.user.center.domain.OauthAccessToken;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface OauthAccessTokenMapper extends Mapper<OauthAccessToken>, MySqlMapper<OauthAccessToken> {
    int updateBatch(List<OauthAccessToken> list);

    int batchInsert(@Param("list") List<OauthAccessToken> list);

    int insertOrUpdate(OauthAccessToken record);

    int insertOrUpdateSelective(OauthAccessToken record);
}