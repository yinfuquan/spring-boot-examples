package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.OmsCartItem;
public interface OmsCartItemService{


    int deleteByPrimaryKey(Long id);

    int insert(OmsCartItem record);

    int insertOrUpdate(OmsCartItem record);

    int insertOrUpdateSelective(OmsCartItem record);

    int insertSelective(OmsCartItem record);

    OmsCartItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsCartItem record);

    int updateByPrimaryKey(OmsCartItem record);

    int updateBatch(List<OmsCartItem> list);

    int batchInsert(List<OmsCartItem> list);

}
