package com.yin.springboot.user.center.server;

import java.util.List;
import com.yin.springboot.user.center.domain.OauthClientToken;

public interface OauthClientTokenService {


    int updateBatch(List<OauthClientToken> list);

    int batchInsert(List<OauthClientToken> list);

    int insertOrUpdate(OauthClientToken record);

    int insertOrUpdateSelective(OauthClientToken record);

}

