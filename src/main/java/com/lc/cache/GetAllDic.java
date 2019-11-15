package com.lc.cache;

import com.lc.dao.SysDicMapper;
import com.lc.model.entity.SysDic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * @author lc
 */
@Repository
public class GetAllDic implements Serializable {

    @Autowired
    SysDicMapper sysDicMapper;

    public List<SysDic> getALLdic(){
        return sysDicMapper.getAllDic();
    }
}
