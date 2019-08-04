package com.yin.springboot.mybatis.server;

import com.yin.springboot.mybatis.domain.PmsAlbumPic;
import java.util.List;
public interface PmsAlbumPicService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsAlbumPic record);

    int insertOrUpdate(PmsAlbumPic record);

    int insertOrUpdateSelective(PmsAlbumPic record);

    int insertSelective(PmsAlbumPic record);

    PmsAlbumPic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsAlbumPic record);

    int updateByPrimaryKey(PmsAlbumPic record);

    int updateBatch(List<PmsAlbumPic> list);

    int batchInsert(List<PmsAlbumPic> list);

}
