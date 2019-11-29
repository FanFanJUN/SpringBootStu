package com.lc.service.impl;

import com.lc.dao.SysDicMapper;
import com.lc.model.entity.SysDic;
import com.lc.service.SysDicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysDicServiceImpl implements SysDicService {

    @Resource
    SysDicMapper sysDicMapper;

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
    public List selectList() {
        return sysDicMapper.selectList();
    }
}
