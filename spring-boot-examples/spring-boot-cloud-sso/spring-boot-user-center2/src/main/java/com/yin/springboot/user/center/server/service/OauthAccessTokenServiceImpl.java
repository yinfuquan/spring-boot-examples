package com.yin.springboot.user.center.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.user.center.mapper.OauthAccessTokenMapper;
import com.yin.springboot.user.center.domain.OauthAccessToken;
import com.yin.springboot.user.center.server.OauthAccessTokenService;
@Service
public class OauthAccessTokenServiceImpl implements OauthAccessTokenService{

    @Resource
    private OauthAccessTokenMapper oauthAccessTokenMapper;

    @Override
    public int updateBatch(List<OauthAccessToken> list) {
        return oauthAccessTokenMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<OauthAccessToken> list) {
        return oauthAccessTokenMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(OauthAccessToken record) {
        return oauthAccessTokenMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(OauthAccessToken record) {
        return oauthAccessTokenMapper.insertOrUpdateSelective(record);
    }

}
