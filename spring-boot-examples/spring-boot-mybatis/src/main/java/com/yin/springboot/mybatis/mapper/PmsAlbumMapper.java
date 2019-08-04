package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.PmsAlbum;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsAlbumMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsAlbum record);

    int insertOrUpdate(PmsAlbum record);

    int insertOrUpdateSelective(PmsAlbum record);

    int insertSelective(PmsAlbum record);

    PmsAlbum selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsAlbum record);

    int updateByPrimaryKey(PmsAlbum record);

    int updateBatch(List<PmsAlbum> list);

    int batchInsert(@Param("list") List<PmsAlbum> list);
}