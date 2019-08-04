package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yin.springboot.mybatis.mapper.CmsPrefrenceAreaMapper;
import java.util.List;
import com.yin.springboot.mybatis.domain.CmsPrefrenceArea;
import com.yin.springboot.mybatis.server.CmsPrefrenceAreaService;
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService{

    @Resource
    private CmsPrefrenceAreaMapper cmsPrefrenceAreaMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cmsPrefrenceAreaMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CmsPrefrenceArea record) {
        return cmsPrefrenceAreaMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(CmsPrefrenceArea record) {
        return cmsPrefrenceAreaMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CmsPrefrenceArea record) {
        return cmsPrefrenceAreaMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(CmsPrefrenceArea record) {
        return cmsPrefrenceAreaMapper.insertSelective(record);
    }

    @Override
    public CmsPrefrenceArea selectByPrimaryKey(Long id) {
        return cmsPrefrenceAreaMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsPrefrenceArea record) {
        return cmsPrefrenceAreaMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsPrefrenceArea record) {
        return cmsPrefrenceAreaMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CmsPrefrenceArea> list) {
        return cmsPrefrenceAreaMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CmsPrefrenceArea> list) {
        return cmsPrefrenceAreaMapper.batchInsert(list);
    }

}
