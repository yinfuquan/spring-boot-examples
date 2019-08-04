package com.yin.springboot.user.center.mapper;

import com.yin.springboot.user.center.domain.Clientdetails;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface ClientdetailsMapper extends Mapper<Clientdetails>, MySqlMapper<Clientdetails> {
    int updateBatch(List<Clientdetails> list);

    int batchInsert(@Param("list") List<Clientdetails> list);

    int insertOrUpdate(Clientdetails record);

    int insertOrUpdateSelective(Clientdetails record);
}