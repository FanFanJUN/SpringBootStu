package com.lc.cache;

import com.lc.common.ParamConstant;
import com.lc.model.entity.SysDic;
import com.lc.model.entity.SysDicVo;
import com.lc.tools.redis.RedisClient;
import org.apache.commons.lang3.StringUtils;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class BaseCache {
    @Autowired
    GetAllDic getAllDic;

    @Autowired
    Environment environment; // 使用spring boot 里面的 Environment 直接取值

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
        refreshCache();
//        redisCacheinit();
    }

    /**
     * redis 查询数据放入redis
     */
    private void redisCacheinit() {
        RedissonClient redissonClient = RedisClient.INSTANCE.createRedisClient();
        if(StringUtils.equals(environment.getProperty(ParamConstant.CODE_CACHE_DIC), CacheSwitchEnum.ON.getCode())) {
            logger.debug("数据字典处理开始");
            try {
                List<SysDic> allDic = getAllDic.getALLdic();
                RBucket<List> keyObj = redissonClient.getBucket("dicAlL");
                keyObj.set(allDic);
            } catch (Exception e) {
                logger.info("数据字典缓存失败");
            }
        }
    }
    /**
     * 对数据字典进行增删改查时需要调用refreshDictCache()方法来刷新缓存，保证缓存中数据为最新数据
     */
    public void refreshCache() {
        logger.info(environment.getProperty(ParamConstant.CODE_CACHE_DIC));
        CacheConstant.cacheBaseMap.clear();
        if(StringUtils.equals(environment.getProperty(ParamConstant.CODE_CACHE_DIC), CacheSwitchEnum.ON.getCode())) {
            logger.debug("数据字典处理开始");
            try {
                List<SysDic> allDic = getAllDic.getALLdic();
                CacheConstant.cacheBaseMap = allDic.stream().collect(Collectors.groupingBy(SysDic::getDictionaryCategoryNo));
            } catch (Exception e) {
                logger.info("数据字典缓存失败");
            }
        }
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
