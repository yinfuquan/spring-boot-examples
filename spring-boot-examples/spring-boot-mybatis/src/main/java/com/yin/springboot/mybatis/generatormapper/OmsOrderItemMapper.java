package com.yin.springboot.mybatis.generatormapper;

import com.yin.springboot.mybatis.generatormodel.OmsOrderItem;
import com.yin.springboot.mybatis.generatormodel.OmsOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderItemMapper {
    int countByExample(OmsOrderItemExample example);

    int deleteByExample(OmsOrderItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderItem record);

    int insertSelective(OmsOrderItem record);

    List<OmsOrderItem> selectByExample(OmsOrderItemExample example);

    OmsOrderItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OmsOrderItem record, @Param("example") OmsOrderItemExample example);

    int updateByExample(@Param("record") OmsOrderItem record, @Param("example") OmsOrderItemExample example);

    int updateByPrimaryKeySelective(OmsOrderItem record);

    int updateByPrimaryKey(OmsOrderItem record);
}