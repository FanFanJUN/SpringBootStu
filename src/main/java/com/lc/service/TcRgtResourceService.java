package com.lc.service;

import com.lc.model.entity.TcRgtResource;

import java.util.List;
import java.util.Map;

public interface TcRgtResourceService {
    List selectByParentNo(TcRgtResource tcRgtResource);

    List selectByResourceNo(TcRgtResource tcRgtResource);

    int insertSelective(TcRgtResource record);

    int deleteByPrimaryKey(String resourceId);

    int updateByPrimaryKeySelective(TcRgtResource record);
}
