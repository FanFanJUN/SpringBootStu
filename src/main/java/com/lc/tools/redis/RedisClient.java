package com.lc.tools.redis;

import com.lc.common.utils.PropertiesUtils;
import org.redisson.Redisson;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

/**
 * 利用redisson API操作各种redis部署的服务端
 * 单节点部署方式(standalone)
 * https://github.com/redisson/redisson/wiki/2.-%E9%85%8D%E7%BD%AE%E6%96%B9%E6%B3%95 配置方法
 */
public enum RedisClient {
    /**
     * Redis实例
     */
    INSTANCE;
    private RedissonClient redissonClient;
    RedisClient() {
        redissonClient = createRedisClient();
    }

    public RedissonClient createRedisClient() {
        if(redissonClient != null && !redissonClient.isShutdown()) {
            return redissonClient;
        }
        Config config =new Config();

        config.setCodec(new org.redisson.client.codec.StringCodec());

        PropertiesUtils propertiesUtils = new PropertiesUtils();
        config.useSingleServer().setAddress("redis://129.28.167.200:6379");
        //创建客户端(发现创建RedissonClient非常耗时，基本在2秒-4秒左右)
        return redissonClient = Redisson.create(config);
    }

    public RedissonClient getRedissonClient() {
        return redissonClient;
    }

    public void shutdown() {
        redissonClient.shutdown();
    }

    public static void main(String[] args) {
        RedissonClient redissonClient = RedisClient.INSTANCE.createRedisClient();
        System.out.println("客户端已启动");
        // 设置字符串
        RBucket<String> keyObj = redissonClient.getBucket("k");
        keyObj.set("v1236");
    }
}
