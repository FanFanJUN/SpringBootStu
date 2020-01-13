package com.lc.dao;

import com.lc.model.entity.TcRgtRoleGroup;

import java.util.List;

public interface TcRgtRoleGroupMapper {
    int deleteByPrimaryKey(String roleId);

    int insert(TcRgtRoleGroup record);

    int insertSelective(TcRgtRoleGroup record);

    TcRgtRoleGroup selectByPrimaryKey(String roleId);

    int updateByPrimaryKeySelective(TcRgtRoleGroup record);

    int updateByPrimaryKey(TcRgtRoleGroup record);

    List selectTcrgtRoleList();
}