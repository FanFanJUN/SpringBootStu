package com.lc.common.utils;

import com.lc.cache.GetAllDic;
import com.lc.model.entity.SysDic;
import com.lc.tools.redis.RedisCacheService;
import com.lc.tools.redis.RedisClient;
import org.redisson.api.RedissonClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Repository
public class RedisCacheUtils {
    @Autowired
    GetAllDic getAllDic;
    private RedisCacheService  rserver;
    private String Cachename;

    private final static Logger logger = LoggerFactory.getLogger(RedisCacheUtils.class);
    public RedisCacheUtils(String Cachename) {
        this.Cachename = Cachename;
        RedissonClient redissonClient = RedisClient.INSTANCE.getRedissonClient();
        this.rserver = RedisCacheService.of(redissonClient, Cachename, false, true);
    }

    public RedisCacheUtils() {
        super();
    }

    public void redisCachePut(String keyName, Object object) {
        this.rserver.put(keyName, object);
    }

    public Object redisCacheGet(String keyName) {
        if(!rserver.containsKey(keyName)) {
            return null;
        }
        Map<String, Object> map = rserver.get(keyName);
        return  map.get(keyName);
    }

    public void redisCacheFlush() {
        RedisCacheUtils utils = new RedisCacheUtils("AlertCache");
        List<SysDic> list = getAllDic.getALLdic();
        logger.info(list.toString());
        if(list != null && !list.isEmpty()) {
            utils.redisCachePut("initCache", list);
        }
    }

    public static void main(String[] args) {
        RedisCacheUtils utils = new RedisCacheUtils("AlertCache");
//        List<SysDic> list = (List<SysDic>)
//        utils.redisCacheGet("initCache");
        logger.info(utils.redisCacheGet("initCache")+ "获取");
//        if(list != null) {
//            logger.info("获取rediss数据字典");
//        }
    }

}
