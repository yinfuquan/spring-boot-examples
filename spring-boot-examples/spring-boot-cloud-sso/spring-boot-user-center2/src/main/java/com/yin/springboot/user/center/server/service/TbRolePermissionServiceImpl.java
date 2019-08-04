package com.yin.springboot.user.center.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yin.springboot.user.center.domain.TbRolePermission;
import java.util.List;
import com.yin.springboot.user.center.mapper.TbRolePermissionMapper;
import com.yin.springboot.user.center.server.TbRolePermissionService;
@Service
public class TbRolePermissionServiceImpl implements TbRolePermissionService{

    @Resource
    private TbRolePermissionMapper tbRolePermissionMapper;

    @Override
    public int updateBatch(List<TbRolePermission> list) {
        return tbRolePermissionMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<TbRolePermission> list) {
        return tbRolePermissionMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(TbRolePermission record) {
        return tbRolePermissionMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(TbRolePermission record) {
        return tbRolePermissionMapper.insertOrUpdateSelective(record);
    }

}
