package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.domain.OmsCompanyAddress;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsCompanyAddressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsCompanyAddress record);

    int insertOrUpdate(OmsCompanyAddress record);

    int insertOrUpdateSelective(OmsCompanyAddress record);

    int insertSelective(OmsCompanyAddress record);

    OmsCompanyAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsCompanyAddress record);

    int updateByPrimaryKey(OmsCompanyAddress record);

    int updateBatch(List<OmsCompanyAddress> list);

    int batchInsert(@Param("list") List<OmsCompanyAddress> list);
}