package com.lc.service;

import com.lc.model.entity.TcRgtRoleGroup;

import java.util.List;

public interface TcRgtRoleService {
    int deleteByPrimaryKey(String roleId);

    int insertSelective(TcRgtRoleGroup record);

    int updateByPrimaryKeySelective(TcRgtRoleGroup record);

    List selectTcrgtRoleList();
}
