package com.yin.springboot.user.center.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.user.center.domain.OauthClientToken;
import com.yin.springboot.user.center.mapper.OauthClientTokenMapper;
import com.yin.springboot.user.center.server.OauthClientTokenService;
@Service
public class OauthClientTokenServiceImpl implements OauthClientTokenService{

    @Resource
    private OauthClientTokenMapper oauthClientTokenMapper;

    @Override
    public int updateBatch(List<OauthClientToken> list) {
        return oauthClientTokenMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<OauthClientToken> list) {
        return oauthClientTokenMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(OauthClientToken record) {
        return oauthClientTokenMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(OauthClientToken record) {
        return oauthClientTokenMapper.insertOrUpdateSelective(record);
    }

}
