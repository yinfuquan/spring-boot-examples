package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.PmsAlbum;
public interface PmsAlbumService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsAlbum record);

    int insertOrUpdate(PmsAlbum record);

    int insertOrUpdateSelective(PmsAlbum record);

    int insertSelective(PmsAlbum record);

    PmsAlbum selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsAlbum record);

    int updateByPrimaryKey(PmsAlbum record);

    int updateBatch(List<PmsAlbum> list);

    int batchInsert(List<PmsAlbum> list);

}
