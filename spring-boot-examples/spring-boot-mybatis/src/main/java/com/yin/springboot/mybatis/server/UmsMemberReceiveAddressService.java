package com.yin.springboot.mybatis.server;

import com.yin.springboot.mybatis.domain.UmsMemberReceiveAddress;
import java.util.List;
public interface UmsMemberReceiveAddressService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberReceiveAddress record);

    int insertOrUpdate(UmsMemberReceiveAddress record);

    int insertOrUpdateSelective(UmsMemberReceiveAddress record);

    int insertSelective(UmsMemberReceiveAddress record);

    UmsMemberReceiveAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberReceiveAddress record);

    int updateByPrimaryKey(UmsMemberReceiveAddress record);

    int updateBatch(List<UmsMemberReceiveAddress> list);

    int batchInsert(List<UmsMemberReceiveAddress> list);

}
