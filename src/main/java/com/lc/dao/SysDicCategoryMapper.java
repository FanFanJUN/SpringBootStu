package com.lc.dao;

import com.lc.model.entity.SysDicCategory;

import java.util.List;

public interface SysDicCategoryMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysDicCategory record);

    int insertSelective(SysDicCategory record);

    SysDicCategory selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysDicCategory record);

    int updateByPrimaryKey(SysDicCategory record);
    
    List selectList(SysDicCategory sysDicCategory);
}