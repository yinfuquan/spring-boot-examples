package com.yin.springboot.user.center.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yin.springboot.user.center.domain.TbRole;
import com.yin.springboot.user.center.mapper.TbRoleMapper;
import java.util.List;
import com.yin.springboot.user.center.server.TbRoleService;
@Service
public class TbRoleServiceImpl implements TbRoleService{

    @Resource
    private TbRoleMapper tbRoleMapper;

    @Override
    public int updateBatch(List<TbRole> list) {
        return tbRoleMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<TbRole> list) {
        return tbRoleMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(TbRole record) {
        return tbRoleMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(TbRole record) {
        return tbRoleMapper.insertOrUpdateSelective(record);
    }

}
