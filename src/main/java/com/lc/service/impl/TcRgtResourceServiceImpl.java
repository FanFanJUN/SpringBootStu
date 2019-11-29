package com.lc.service.impl;

import com.lc.dao.TcRgtResourceMapper;
import com.lc.model.entity.TcRgtResource;
import com.lc.service.TcRgtResourceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TcRgtResourceServiceImpl implements TcRgtResourceService {

    @Resource
    TcRgtResourceMapper tcRgtResourceMapper;

    @Override
    public List selectByParentNo(TcRgtResource tcRgtResource) {
        return tcRgtResourceMapper.selectByParentNo(tcRgtResource);
    }
}
