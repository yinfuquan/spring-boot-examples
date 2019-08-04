package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.CmsPrefrenceArea;
public interface CmsPrefrenceAreaService{


    int deleteByPrimaryKey(Long id);

    int insert(CmsPrefrenceArea record);

    int insertOrUpdate(CmsPrefrenceArea record);

    int insertOrUpdateSelective(CmsPrefrenceArea record);

    int insertSelective(CmsPrefrenceArea record);

    CmsPrefrenceArea selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsPrefrenceArea record);

    int updateByPrimaryKey(CmsPrefrenceArea record);

    int updateBatch(List<CmsPrefrenceArea> list);

    int batchInsert(List<CmsPrefrenceArea> list);

}
