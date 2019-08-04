package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.PdmanDbVersion;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdmanDbVersionMapper {
    int insert(PdmanDbVersion record);

    int insertOrUpdate(PdmanDbVersion record);

    int insertOrUpdateSelective(PdmanDbVersion record);

    int insertSelective(PdmanDbVersion record);

    int batchInsert(@Param("list") List<PdmanDbVersion> list);
}