package com.lc.tools.redis;

import com.google.common.collect.Maps;
import org.redisson.api.RMap;
import org.redisson.api.RSetCache;
import org.redisson.api.RedissonClient;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class RedisCacheService {

    private static final int Null_VALUE_KEY = 5*60*1000;
    private String cacheName; // 缓存名字
    private boolean ttlControl; // 是否有ttl控制
    private boolean cacheNull; // 是否缓存null值
    private RedissonClient redisson; // RedissonClient客户端
    private RMap rMap; // 分布式map集合
    private String cacheSetName; // 集合名词
    private RSetCache rSetCache; // 集合可缓存空值


    public static RedisCacheService of(RedissonClient redisson, String cacheName, boolean ttlControl,
                                       boolean cacheNull) {
        return new RedisCacheService(redisson,cacheName,ttlControl,cacheNull);
    }

    private RedisCacheService(RedissonClient redisson, String cacheName, boolean ttlControl,
                              boolean cacheNull) {
        this.redisson = redisson;
        this.cacheName = cacheName;
        this.cacheSetName = cacheName+"_null_value_key_set";
        if(ttlControl) {
            this.rMap = redisson.getMapCache(this.cacheName);
        } else {
            this.rMap = redisson.getMap(this.cacheName);
        }

        if(cacheNull) {
            this.rSetCache = redisson.getSetCache(this.cacheSetName);
        }
        this.cacheNull = cacheNull;
        this.ttlControl = ttlControl;
    }

    /**
     * 存入map
     * @param key
     * @param value
     * @return
     */
    public Object put(Object key, Object value) {
        if(value == null) {
            if(cacheNull) {
                rSetCache.add(key, Null_VALUE_KEY, TimeUnit.MILLISECONDS);
            }
        } else {
            rMap.put(key, value);
        }
        return value;
    }

    /**
     * 判断是否存在key
     * @param key
     * @return
     */
    public boolean containsKey (Object key) {
        boolean result = rMap.containsKey(key);
        if(!result && cacheNull) {
            result = rSetCache.contains(key);
        }
        return result;
    }

    public Map get(Object key) {
        Map map = Maps.newHashMapWithExpectedSize(1);
        Object result = rMap.get(key);
        if((result == null && cacheNull && rSetCache.contains(key)) || result != null) {
            map.put(key, result);
        }
        return map;
    }

}
