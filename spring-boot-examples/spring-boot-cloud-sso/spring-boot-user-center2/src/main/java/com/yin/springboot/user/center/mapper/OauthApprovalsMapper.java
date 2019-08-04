package com.yin.springboot.user.center.mapper;

import com.yin.springboot.user.center.domain.OauthApprovals;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface OauthApprovalsMapper extends Mapper<OauthApprovals>, MySqlMapper<OauthApprovals> {
    int batchInsert(@Param("list") List<OauthApprovals> list);

    int insertOrUpdate(OauthApprovals record);

    int insertOrUpdateSelective(OauthApprovals record);
}