package com.yin.springboot.user.center.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.user.center.mapper.TbUserRoleMapper;
import com.yin.springboot.user.center.domain.TbUserRole;
import com.yin.springboot.user.center.server.TbUserRoleService;
@Service
public class TbUserRoleServiceImpl implements TbUserRoleService{

    @Resource
    private TbUserRoleMapper tbUserRoleMapper;

    @Override
    public int updateBatch(List<TbUserRole> list) {
        return tbUserRoleMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<TbUserRole> list) {
        return tbUserRoleMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(TbUserRole record) {
        return tbUserRoleMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(TbUserRole record) {
        return tbUserRoleMapper.insertOrUpdateSelective(record);
    }

}
