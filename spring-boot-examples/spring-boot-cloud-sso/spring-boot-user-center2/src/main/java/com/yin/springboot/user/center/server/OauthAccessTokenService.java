package com.yin.springboot.user.center.server;

import java.util.List;
import com.yin.springboot.user.center.domain.OauthAccessToken;

public interface OauthAccessTokenService {


    int updateBatch(List<OauthAccessToken> list);

    int batchInsert(List<OauthAccessToken> list);

    int insertOrUpdate(OauthAccessToken record);

    int insertOrUpdateSelective(OauthAccessToken record);

}

