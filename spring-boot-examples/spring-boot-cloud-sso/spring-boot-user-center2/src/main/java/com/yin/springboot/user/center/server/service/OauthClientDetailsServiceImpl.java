package com.yin.springboot.user.center.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.user.center.mapper.OauthClientDetailsMapper;
import com.yin.springboot.user.center.domain.OauthClientDetails;
import com.yin.springboot.user.center.server.OauthClientDetailsService;
@Service
public class OauthClientDetailsServiceImpl implements OauthClientDetailsService{

    @Resource
    private OauthClientDetailsMapper oauthClientDetailsMapper;

    @Override
    public int updateBatch(List<OauthClientDetails> list) {
        return oauthClientDetailsMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<OauthClientDetails> list) {
        return oauthClientDetailsMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(OauthClientDetails record) {
        return oauthClientDetailsMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(OauthClientDetails record) {
        return oauthClientDetailsMapper.insertOrUpdateSelective(record);
    }

}
