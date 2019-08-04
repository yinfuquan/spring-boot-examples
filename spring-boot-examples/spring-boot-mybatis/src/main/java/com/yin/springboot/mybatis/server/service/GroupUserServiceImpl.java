package com.yin.springboot.mybatis.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yin.springboot.mybatis.mapper.GroupUserMapper;
import com.yin.springboot.mybatis.domain.GroupUser;
import com.yin.springboot.mybatis.server.GroupUserService;
@Service
public class GroupUserServiceImpl implements GroupUserService{

    @Resource
    private GroupUserMapper groupUserMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return groupUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GroupUser record) {
        return groupUserMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(GroupUser record) {
        return groupUserMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(GroupUser record) {
        return groupUserMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(GroupUser record) {
        return groupUserMapper.insertSelective(record);
    }

    @Override
    public GroupUser selectByPrimaryKey(Integer id) {
        return groupUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(GroupUser record) {
        return groupUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GroupUser record) {
        return groupUserMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<GroupUser> list) {
        return groupUserMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<GroupUser> list) {
        return groupUserMapper.batchInsert(list);
    }

}
