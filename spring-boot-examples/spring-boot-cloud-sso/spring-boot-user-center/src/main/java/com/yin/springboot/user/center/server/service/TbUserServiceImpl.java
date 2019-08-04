package com.yin.springboot.user.center.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yin.springboot.user.center.mapper.TbUserMapper;
import com.yin.springboot.user.center.domain.TbUser;
import java.util.List;
import com.yin.springboot.user.center.server.TbUserService;
import tk.mybatis.mapper.entity.Example;

@Service
public class TbUserServiceImpl implements TbUserService{

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public int updateBatch(List<TbUser> list) {
        return tbUserMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<TbUser> list) {
        return tbUserMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(TbUser record) {
        return tbUserMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(TbUser record) {
        return tbUserMapper.insertOrUpdateSelective(record);
    }

    @Override
    public TbUser getByUsername(String username) {
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username", username);
        return tbUserMapper.selectOneByExample(example);
    }

}
