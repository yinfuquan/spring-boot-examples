package com.yin.springboot.user.center.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.user.center.domain.OauthCode;
import com.yin.springboot.user.center.mapper.OauthCodeMapper;
import com.yin.springboot.user.center.server.OauthCodeService;
@Service
public class OauthCodeServiceImpl implements OauthCodeService{

    @Resource
    private OauthCodeMapper oauthCodeMapper;

    @Override
    public int batchInsert(List<OauthCode> list) {
        return oauthCodeMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(OauthCode record) {
        return oauthCodeMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(OauthCode record) {
        return oauthCodeMapper.insertOrUpdateSelective(record);
    }

}
