package com.yin.springboot.mybatis.mapper;

import com.yin.springboot.mybatis.OrderTestSql;
import com.yin.springboot.mybatis.domain.OmsOrder;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.cursor.Cursor;

public interface OmsOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrder record);

    int insertOrUpdate(OmsOrder record);

    int insertOrUpdateSelective(OmsOrder record);

    int insertSelective(OmsOrder record);

    OmsOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrder record);

    int updateByPrimaryKey(OmsOrder record);

    int updateBatch(List<OmsOrder> list);

    int batchInsert(@Param("list") List<OmsOrder> list);

    OrderTestSql  selectOrderitemListById(Long id);

    OrderTestSql selectOneOrderitemListById(Long id);

    List<OmsOrder> selectAll();

    Cursor<OmsOrder> selectCursor();

}