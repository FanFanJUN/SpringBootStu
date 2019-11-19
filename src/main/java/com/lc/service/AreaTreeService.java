package com.lc.service;

import com.lc.model.entity.SysTreeDic;

import java.util.List;

public interface AreaTreeService {
    List selectTreeNodes(SysTreeDic record);
}
