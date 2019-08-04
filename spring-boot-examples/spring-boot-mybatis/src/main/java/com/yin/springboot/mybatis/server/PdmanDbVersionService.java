package com.yin.springboot.mybatis.server;

import java.util.List;
import com.yin.springboot.mybatis.domain.PdmanDbVersion;
public interface PdmanDbVersionService{


    int insert(PdmanDbVersion record);

    int insertOrUpdate(PdmanDbVersion record);

    int insertOrUpdateSelective(PdmanDbVersion record);

    int insertSelective(PdmanDbVersion record);

    int batchInsert(List<PdmanDbVersion> list);

}
