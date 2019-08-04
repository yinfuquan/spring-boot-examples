package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.PdmanDbVersion;
import com.yin.springboot.mybatis.mapper.PdmanDbVersionMapper;
import com.yin.springboot.mybatis.server.PdmanDbVersionService;
@Service
public class PdmanDbVersionServiceImpl implements PdmanDbVersionService{

    @Resource
    private PdmanDbVersionMapper pdmanDbVersionMapper;

    @Override
    public int insert(PdmanDbVersion record) {
        return pdmanDbVersionMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PdmanDbVersion record) {
        return pdmanDbVersionMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PdmanDbVersion record) {
        return pdmanDbVersionMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PdmanDbVersion record) {
        return pdmanDbVersionMapper.insertSelective(record);
    }

    @Override
    public int batchInsert(List<PdmanDbVersion> list) {
        return pdmanDbVersionMapper.batchInsert(list);
    }

}
