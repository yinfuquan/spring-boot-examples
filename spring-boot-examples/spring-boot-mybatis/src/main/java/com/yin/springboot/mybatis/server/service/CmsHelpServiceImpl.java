package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.domain.CmsHelp;
import com.yin.springboot.mybatis.mapper.CmsHelpMapper;
import com.yin.springboot.mybatis.server.CmsHelpService;
@Service
public class CmsHelpServiceImpl implements CmsHelpService{

    @Resource
    private CmsHelpMapper cmsHelpMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cmsHelpMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CmsHelp record) {
        return cmsHelpMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(CmsHelp record) {
        return cmsHelpMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CmsHelp record) {
        return cmsHelpMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(CmsHelp record) {
        return cmsHelpMapper.insertSelective(record);
    }

    @Override
    public CmsHelp selectByPrimaryKey(Long id) {
        return cmsHelpMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsHelp record) {
        return cmsHelpMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsHelp record) {
        return cmsHelpMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CmsHelp> list) {
        return cmsHelpMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CmsHelp> list) {
        return cmsHelpMapper.batchInsert(list);
    }

}
