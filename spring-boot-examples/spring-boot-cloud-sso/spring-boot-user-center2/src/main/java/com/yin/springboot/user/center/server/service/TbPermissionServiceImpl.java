package com.yin.springboot.user.center.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.user.center.mapper.TbPermissionMapper;
import com.yin.springboot.user.center.domain.TbPermission;
import com.yin.springboot.user.center.server.TbPermissionService;
@Service
public class TbPermissionServiceImpl implements TbPermissionService{

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public int updateBatch(List<TbPermission> list) {
        return tbPermissionMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<TbPermission> list) {
        return tbPermissionMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(TbPermission record) {
        return tbPermissionMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(TbPermission record) {
        return tbPermissionMapper.insertOrUpdateSelective(record);
    }

    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return tbPermissionMapper.selectByUserId(userId);
    }

}
