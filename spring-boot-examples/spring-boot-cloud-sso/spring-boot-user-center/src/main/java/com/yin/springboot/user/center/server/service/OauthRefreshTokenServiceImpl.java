package com.yin.springboot.user.center.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.user.center.mapper.OauthRefreshTokenMapper;
import com.yin.springboot.user.center.domain.OauthRefreshToken;
import com.yin.springboot.user.center.server.OauthRefreshTokenService;
@Service
public class OauthRefreshTokenServiceImpl implements OauthRefreshTokenService{

    @Resource
    private OauthRefreshTokenMapper oauthRefreshTokenMapper;

    @Override
    public int batchInsert(List<OauthRefreshToken> list) {
        return oauthRefreshTokenMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(OauthRefreshToken record) {
        return oauthRefreshTokenMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(OauthRefreshToken record) {
        return oauthRefreshTokenMapper.insertOrUpdateSelective(record);
    }

}
