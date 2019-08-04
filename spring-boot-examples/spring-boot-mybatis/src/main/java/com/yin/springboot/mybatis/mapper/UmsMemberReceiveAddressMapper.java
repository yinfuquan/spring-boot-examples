package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.UmsMemberReceiveAddress;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberReceiveAddressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberReceiveAddress record);

    int insertOrUpdate(UmsMemberReceiveAddress record);

    int insertOrUpdateSelective(UmsMemberReceiveAddress record);

    int insertSelective(UmsMemberReceiveAddress record);

    UmsMemberReceiveAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberReceiveAddress record);

    int updateByPrimaryKey(UmsMemberReceiveAddress record);

    int updateBatch(List<UmsMemberReceiveAddress> list);

    int batchInsert(@Param("list") List<UmsMemberReceiveAddress> list);
}