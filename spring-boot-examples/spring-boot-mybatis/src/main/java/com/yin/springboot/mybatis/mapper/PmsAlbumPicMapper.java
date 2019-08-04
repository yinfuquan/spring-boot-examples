package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.PmsAlbumPic;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsAlbumPicMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsAlbumPic record);

    int insertOrUpdate(PmsAlbumPic record);

    int insertOrUpdateSelective(PmsAlbumPic record);

    int insertSelective(PmsAlbumPic record);

    PmsAlbumPic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsAlbumPic record);

    int updateByPrimaryKey(PmsAlbumPic record);

    int updateBatch(List<PmsAlbumPic> list);

    int batchInsert(@Param("list") List<PmsAlbumPic> list);
}