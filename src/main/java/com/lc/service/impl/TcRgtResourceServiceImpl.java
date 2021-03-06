package com.lc.service.impl;

import com.lc.dao.TcRgtResourceMapper;
import com.lc.model.entity.TcRgtResource;
import com.lc.service.TcRgtResourceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class TcRgtResourceServiceImpl implements TcRgtResourceService {

    @Resource
    TcRgtResourceMapper tcRgtResourceMapper;

    @Override
    public List selectByParentNo(TcRgtResource tcRgtResource) {
        return tcRgtResourceMapper.selectByParentNo(tcRgtResource);
    }

    @Override
    public List selectByResourceNo(TcRgtResource tcRgtResource) {
        String flag = tcRgtResource.getResourceLvl();
        if("1".equals(flag) || "2".equals(flag)) {
           return  tcRgtResourceMapper.selectByParentNo(tcRgtResource);
        } else {
            return tcRgtResourceMapper.selectByResourceNo(tcRgtResource);
        }
    }

    @Override
    public  int insertSelective(TcRgtResource tcRgtResource) {
        return tcRgtResourceMapper.insertSelective(tcRgtResource);
    }

    @Override
    public int deleteByPrimaryKey(String resourceId) {
        return tcRgtResourceMapper.deleteByPrimaryKey(resourceId);
    }

    @Override
    public int updateByPrimaryKeySelective(TcRgtResource record) {
        return tcRgtResourceMapper.updateByPrimaryKeySelective(record);
    }

}
