package com.yin.springboot.user.center.server;

import java.util.List;
import com.yin.springboot.user.center.domain.OauthClientDetails;

public interface OauthClientDetailsService {


    int updateBatch(List<OauthClientDetails> list);

    int batchInsert(List<OauthClientDetails> list);

    int insertOrUpdate(OauthClientDetails record);

    int insertOrUpdateSelective(OauthClientDetails record);

}

