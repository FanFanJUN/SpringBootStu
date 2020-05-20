package com.lc.dao;

import com.lc.model.entity.TcRgtResource;

import java.util.List;
import java.util.Map;

public interface TcRgtResourceMapper {
    int deleteByPrimaryKey(String resourceId);

    int insert(TcRgtResource record);

    int insertSelective(TcRgtResource record);

    TcRgtResource selectByPrimaryKey(String resourceId);

    int updateByPrimaryKeySelective(TcRgtResource record);

    int updateByPrimaryKey(TcRgtResource record);

    List selectByParentNo(TcRgtResource tcRgtResource);

    List selectByResourceNo(TcRgtResource tcRgtResource);
}