package com.lc.service.impl;

import com.lc.dao.SysDicCategoryMapper;
import com.lc.dao.SysDicMapper;
import com.lc.model.entity.SysDic;
import com.lc.model.entity.SysDicCategory;
import com.lc.service.SysDicService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SysDicServiceImpl implements SysDicService {

    @Resource
    SysDicMapper sysDicMapper;
    @Resource
    SysDicCategoryMapper sysDicCategoryMapper;

    @Override
    public int deleteByPrimaryKey(String dictionaryNo, String dictionaryCategoryNo) {
        return sysDicMapper.deleteByPrimaryKey(dictionaryNo, dictionaryCategoryNo);
    }

    @Override
    public int insertSelective(SysDic record) {
        return sysDicMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(SysDic record) {
        return sysDicMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List selectList(SysDic sysDic) {
        return sysDicMapper.selectList(sysDic);
    }

    @Override
    public List<SysDic> selectCategory(SysDicCategory sysDicCategory) {
        // 快速模糊查询
        if(!StringUtils.isEmpty(sysDicCategory.getQuickSearchVqalue())) {
            sysDicCategory.setDictionaryCategoryNo(sysDicCategory.getQuickSearchVqalue());
            sysDicCategory.setDictionaryCategoryNm(sysDicCategory.getQuickSearchVqalue());
        }
        return sysDicCategoryMapper.selectList(sysDicCategory);
    }

    @Override
    public void insertCategorySelective(SysDicCategory sysDicCategory) {
        sysDicCategoryMapper.insertSelective(sysDicCategory);
    }
}
