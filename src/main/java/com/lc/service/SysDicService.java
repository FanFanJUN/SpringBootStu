package com.lc.service;


import com.lc.model.entity.SysDic;
import com.lc.model.entity.SysDicCategory;

import java.util.List;

public interface SysDicService {

    int deleteByPrimaryKey( String dictionaryNo, String dictionaryCategoryNo);

    int insertSelective(SysDic record);

    int updateByPrimaryKeySelective(SysDic record);

    List selectList(SysDic sysDic);
    
    List<SysDic> selectCategory(SysDicCategory sysDicCategory);
    
    void insertCategorySelective(SysDicCategory sysDicCategory);
}
