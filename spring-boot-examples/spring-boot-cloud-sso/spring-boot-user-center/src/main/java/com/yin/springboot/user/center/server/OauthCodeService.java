package com.yin.springboot.user.center.server;

import java.util.List;
import com.yin.springboot.user.center.domain.OauthCode;

public interface OauthCodeService {


    int batchInsert(List<OauthCode> list);

    int insertOrUpdate(OauthCode record);

    int insertOrUpdateSelective(OauthCode record);

}

