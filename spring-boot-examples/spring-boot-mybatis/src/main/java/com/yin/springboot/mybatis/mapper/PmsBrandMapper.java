package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.PmsBrand;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsBrand record);

    int insertOrUpdate(PmsBrand record);

    int insertOrUpdateSelective(PmsBrand record);

    int insertSelective(PmsBrand record);

    PmsBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsBrand record);

    int updateByPrimaryKey(PmsBrand record);

    int updateBatch(List<PmsBrand> list);

    int batchInsert(@Param("list") List<PmsBrand> list);
}