package com.lc.cache;

import com.lc.model.entity.SysDic;
import com.lc.model.entity.SysDicVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Repository
public class BaseCache {
    @Autowired
    GetAllDic getAllDic;

    private final static Logger logger = LoggerFactory.getLogger(BaseCache.class);

    public static BaseCache instance;

    public   BaseCache(){}

    public static BaseCache getInstance() {
        if(instance == null) {
            instance =new BaseCache();
        }
        return instance;
    }

    @PostConstruct
    public void initCache() {
        logger.debug("数据字典处理开始");
        List<SysDic> allDic = getAllDic.getALLdic();
        CacheConstant.cacheBaseMap = allDic.stream().collect(Collectors.groupingBy(SysDic::getDictionaryCategoryNo));
        logger.debug("数据字典处理结束");
    }

    public List<SysDic> getListValue(SysDic sysDic){
        List<SysDic> resultList = new ArrayList<>();
        List<SysDic> dics = CacheConstant.cacheBaseMap.get(sysDic.getDictionaryCategoryNo());
        return  dics;
    }

    public Map<String, List<SysDic>> getDicValue(List<SysDicVo> cacheBaseList) {

        Map<String, List<SysDic>> map = new HashMap<>();
        List<SysDic> result;
        for(SysDicVo sysDicVo: cacheBaseList) {
            result = new ArrayList<>();
            if(!"".equals(sysDicVo.getDictionaryCategoryNo()) && null != sysDicVo.getDictionaryCategoryNo() ){
                if(CacheConstant.cacheBaseMap.containsKey(sysDicVo.getDictionaryCategoryNo())) {
                    map.put(sysDicVo.getDictionaryCategoryNo(), getListValue(sysDicVo));
                } else {
                    map.put(sysDicVo.getDictionaryCategoryNo(), result);
                }
            }
        }
        return map;
    }
}
