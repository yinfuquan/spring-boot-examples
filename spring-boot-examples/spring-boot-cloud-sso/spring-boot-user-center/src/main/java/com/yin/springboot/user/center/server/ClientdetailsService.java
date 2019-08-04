package com.yin.springboot.user.center.server;

import com.yin.springboot.user.center.domain.Clientdetails;
import java.util.List;

public interface ClientdetailsService {


    int updateBatch(List<Clientdetails> list);

    int batchInsert(List<Clientdetails> list);

    int insertOrUpdate(Clientdetails record);

    int insertOrUpdateSelective(Clientdetails record);

}

