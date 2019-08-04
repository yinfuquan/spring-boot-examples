package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yin.springboot.mybatis.domain.PmsAlbumPic;
import java.util.List;
import com.yin.springboot.mybatis.mapper.PmsAlbumPicMapper;
import com.yin.springboot.mybatis.server.PmsAlbumPicService;
@Service
public class PmsAlbumPicServiceImpl implements PmsAlbumPicService{

    @Resource
    private PmsAlbumPicMapper pmsAlbumPicMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsAlbumPicMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsAlbumPic record) {
        return pmsAlbumPicMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PmsAlbumPic record) {
        return pmsAlbumPicMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PmsAlbumPic record) {
        return pmsAlbumPicMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PmsAlbumPic record) {
        return pmsAlbumPicMapper.insertSelective(record);
    }

    @Override
    public PmsAlbumPic selectByPrimaryKey(Long id) {
        return pmsAlbumPicMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsAlbumPic record) {
        return pmsAlbumPicMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsAlbumPic record) {
        return pmsAlbumPicMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PmsAlbumPic> list) {
        return pmsAlbumPicMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PmsAlbumPic> list) {
        return pmsAlbumPicMapper.batchInsert(list);
    }

}
