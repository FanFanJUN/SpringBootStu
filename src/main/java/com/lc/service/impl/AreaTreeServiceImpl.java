package com.lc.service.impl;

import com.lc.dao.SysTreeDicMapper;
import com.lc.model.entity.SysTreeDic;
import com.lc.service.AreaTreeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AreaTreeServiceImpl implements AreaTreeService {

    @Resource
    SysTreeDicMapper sysTreeDicMapper;

    @Override
    public List selectTreeNodes(SysTreeDic record) {
        return sysTreeDicMapper.selectTreeNodes(record);
    }
}
