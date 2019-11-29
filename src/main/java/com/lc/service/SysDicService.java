package com.lc.service;


import com.lc.model.entity.SysDic;

import java.util.List;

public interface SysDicService {

    int deleteByPrimaryKey( String dictionaryNo, String dictionaryCategoryNo);

    int insertSelective(SysDic record);

    int updateByPrimaryKeySelective(SysDic record);

    List selectList();
}
