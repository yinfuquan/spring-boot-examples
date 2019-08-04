package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.PmsBrand;
public interface PmsBrandService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsBrand record);

    int insertOrUpdate(PmsBrand record);

    int insertOrUpdateSelective(PmsBrand record);

    int insertSelective(PmsBrand record);

    PmsBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsBrand record);

    int updateByPrimaryKey(PmsBrand record);

    int updateBatch(List<PmsBrand> list);

    int batchInsert(List<PmsBrand> list);

}
