package com.lc.controller;

import com.alibaba.fastjson.JSON;
import com.lc.cache.BaseCache;
import com.lc.common.CommonResult;
import com.lc.model.entity.SysDic;
import com.lc.model.entity.SysDicVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CacheController {

    @Autowired
    BaseCache baseCache;


    @PostMapping("/api/lc/cacheone")
    public Map cachebatchOne(@RequestBody SysDicVo dicNos){
          List projectIds = dicNos.getProjectIds();
          Map<String, List<SysDic>> map = dealReturnMap(baseCache.getDicValue(projectIds));
          return map;
    }

    public Map dealReturnMap(Map<String, List<SysDic>> cacheMap) {
        List<Map<String, Object>> reList = new ArrayList<>();
        for ( String dictionaryCategoryNo: cacheMap.keySet()) {
            List<Map<String, Object>> subList = new ArrayList<>();
            Map temp = new HashMap();
            String dictionaryCategoryNm = "";
            List<SysDic> list = cacheMap.get(dictionaryCategoryNo);
            if(list != null) {
                for (int i=0; i<list.size(); i++) {
                    SysDic dic = new SysDic();
                    dic = list.get(i);
                    dictionaryCategoryNm = dic.getDictionaryCategoryNm();
                    Map<String, Object> map = new HashMap<>();
                    map = objectToMap(dic);
                    subList.add(map);
                }
            }
            temp.put("dictionaryCategoryNo", dictionaryCategoryNo);
            temp.put("dictionaryCategoryNm", dictionaryCategoryNm);
            temp.put("dictionaries", subList);
            reList.add(temp);
        }
        Map finalMap = new HashMap();
        finalMap.put("retCacheList", reList);
        return  finalMap;
    }

    public Map<String, Object> objectToMap(Object object) {
        if(object == null) {return null;}
        Map<String,Object> map = BeanMap.create(object);
        return map;
    }

}
