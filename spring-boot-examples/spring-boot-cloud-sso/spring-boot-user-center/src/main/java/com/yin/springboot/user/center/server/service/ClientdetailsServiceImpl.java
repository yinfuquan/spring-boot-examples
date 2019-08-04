package com.yin.springboot.user.center.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yin.springboot.user.center.mapper.ClientdetailsMapper;
import com.yin.springboot.user.center.domain.Clientdetails;
import java.util.List;
import com.yin.springboot.user.center.server.ClientdetailsService;
@Service
public class ClientdetailsServiceImpl implements ClientdetailsService{

    @Resource
    private ClientdetailsMapper clientdetailsMapper;

    @Override
    public int updateBatch(List<Clientdetails> list) {
        return clientdetailsMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<Clientdetails> list) {
        return clientdetailsMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Clientdetails record) {
        return clientdetailsMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Clientdetails record) {
        return clientdetailsMapper.insertOrUpdateSelective(record);
    }

}
