package com.lc.service;

import com.lc.model.entity.TestUser;

import java.util.List;

public interface UserService {
    TestUser getUser(TestUser testUser);

    List selectList();

    int insertSelective(TestUser record);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestUser record);
}
