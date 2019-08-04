package com.yin.springboot.user.center.server;

import java.util.List;
import com.yin.springboot.user.center.domain.OauthRefreshToken;

public interface OauthRefreshTokenService {


    int batchInsert(List<OauthRefreshToken> list);

    int insertOrUpdate(OauthRefreshToken record);

    int insertOrUpdateSelective(OauthRefreshToken record);

}

