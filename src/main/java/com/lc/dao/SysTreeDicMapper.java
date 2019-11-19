package com.lc.dao;

import com.lc.model.entity.SysTreeDic;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysTreeDicMapper {
    int deleteByPrimaryKey(@Param("dictionaryNo") String dictionaryNo, @Param("dictionaryCategoryNo") String dictionaryCategoryNo);

    int insert(SysTreeDic record);

    int insertSelective(SysTreeDic record);

    SysTreeDic selectByPrimaryKey(@Param("dictionaryNo") String dictionaryNo, @Param("dictionaryCategoryNo") String dictionaryCategoryNo);

    int updateByPrimaryKeySelective(SysTreeDic record);

    int updateByPrimaryKey(SysTreeDic record);

    List selectTreeNodes(SysTreeDic record);
}