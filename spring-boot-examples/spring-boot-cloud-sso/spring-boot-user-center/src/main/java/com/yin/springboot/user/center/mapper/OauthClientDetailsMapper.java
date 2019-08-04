package com.yin.springboot.user.center.mapper;

import com.yin.springboot.user.center.domain.OauthClientDetails;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface OauthClientDetailsMapper extends Mapper<OauthClientDetails>, MySqlMapper<OauthClientDetails> {
    int updateBatch(List<OauthClientDetails> list);

    int batchInsert(@Param("list") List<OauthClientDetails> list);

    int insertOrUpdate(OauthClientDetails record);

    int insertOrUpdateSelective(OauthClientDetails record);
}