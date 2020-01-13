package com.lc.service.impl;

import com.lc.dao.TcRgtRoleGroupMapper;
import com.lc.model.entity.TcRgtRoleGroup;
import com.lc.service.TcRgtRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TcRgtRoleServiceImpl implements TcRgtRoleService {

    @Resource
    TcRgtRoleGroupMapper tcRgtRoleGroupMapper;

    @Override
    public int deleteByPrimaryKey(String roleId) {
        return tcRgtRoleGroupMapper.deleteByPrimaryKey(roleId);
    }

    @Override
    public int insertSelective(TcRgtRoleGroup record) {
        return tcRgtRoleGroupMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(TcRgtRoleGroup record) {
        return tcRgtRoleGroupMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List selectTcrgtRoleList() {
        return tcRgtRoleGroupMapper.selectTcrgtRoleList();
    }
}
