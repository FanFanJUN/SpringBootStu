package com.lc.dao;

import com.lc.model.entity.SysDic;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysDicMapper {
    int deleteByPrimaryKey(@Param("dictionaryNo") String dictionaryNo, @Param("dictionaryCategoryNo") String dictionaryCategoryNo);

    int insert(SysDic record);

    int insertSelective(SysDic record);

    SysDic selectByPrimaryKey(@Param("dictionaryNo") String dictionaryNo, @Param("dictionaryCategoryNo") String dictionaryCategoryNo);

    int updateByPrimaryKeySelective(SysDic record);

    int updateByPrimaryKey(SysDic record);

    List getAllDic();
}