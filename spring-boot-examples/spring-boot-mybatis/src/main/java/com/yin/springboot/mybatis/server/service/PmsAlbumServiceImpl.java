package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yin.springboot.mybatis.mapper.PmsAlbumMapper;
import java.util.List;
import com.yin.springboot.mybatis.domain.PmsAlbum;
import com.yin.springboot.mybatis.server.PmsAlbumService;
@Service
public class PmsAlbumServiceImpl implements PmsAlbumService{

    @Resource
    private PmsAlbumMapper pmsAlbumMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsAlbumMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsAlbum record) {
        return pmsAlbumMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PmsAlbum record) {
        return pmsAlbumMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PmsAlbum record) {
        return pmsAlbumMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PmsAlbum record) {
        return pmsAlbumMapper.insertSelective(record);
    }

    @Override
    public PmsAlbum selectByPrimaryKey(Long id) {
        return pmsAlbumMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsAlbum record) {
        return pmsAlbumMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsAlbum record) {
        return pmsAlbumMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PmsAlbum> list) {
        return pmsAlbumMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PmsAlbum> list) {
        return pmsAlbumMapper.batchInsert(list);
    }

}
