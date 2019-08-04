package com.yin.springboot.user.center.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.user.center.domain.OauthApprovals;
import com.yin.springboot.user.center.mapper.OauthApprovalsMapper;
import com.yin.springboot.user.center.server.OauthApprovalsService;
@Service
public class OauthApprovalsServiceImpl implements OauthApprovalsService{

    @Resource
    private OauthApprovalsMapper oauthApprovalsMapper;

    @Override
    public int batchInsert(List<OauthApprovals> list) {
        return oauthApprovalsMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(OauthApprovals record) {
        return oauthApprovalsMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(OauthApprovals record) {
        return oauthApprovalsMapper.insertOrUpdateSelective(record);
    }

}
