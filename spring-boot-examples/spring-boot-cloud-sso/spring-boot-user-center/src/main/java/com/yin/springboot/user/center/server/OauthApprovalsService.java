package com.yin.springboot.user.center.server;

import java.util.List;
import com.yin.springboot.user.center.domain.OauthApprovals;

public interface OauthApprovalsService {


    int batchInsert(List<OauthApprovals> list);

    int insertOrUpdate(OauthApprovals record);

    int insertOrUpdateSelective(OauthApprovals record);

}

