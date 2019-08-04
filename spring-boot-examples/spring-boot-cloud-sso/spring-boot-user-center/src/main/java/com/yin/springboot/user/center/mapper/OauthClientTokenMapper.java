package com.yin.springboot.user.center.mapper;

import com.yin.springboot.user.center.domain.OauthClientToken;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface OauthClientTokenMapper extends Mapper<OauthClientToken>, MySqlMapper<OauthClientToken> {
    int updateBatch(List<OauthClientToken> list);

    int batchInsert(@Param("list") List<OauthClientToken> list);

    int insertOrUpdate(OauthClientToken record);

    int insertOrUpdateSelective(OauthClientToken record);
}