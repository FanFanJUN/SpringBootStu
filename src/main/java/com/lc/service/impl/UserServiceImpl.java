package com.lc.service.impl;

import com.lc.dao.TestUserMapper;
import com.lc.model.entity.TestUser;
import com.lc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    TestUserMapper userMapper;
    @Override
    public TestUser getUser(TestUser testUser) {


        return userMapper.selectByPrimaryKey(testUser.getId());
    }

    @Override
    public List selectList() {
        return userMapper.selectList();
    }

    @Override
    public int insertSelective(TestUser record) {
        return userMapper.insertSelective(record);
    }
}
