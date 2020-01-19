package com.lc;

import com.lc.common.utils.RedisCacheUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

/**
 * Spring ApplicationListener使用方法及问题
 * https://blog.csdn.net/wo541075754/article/details/71720984
 */
@Service
public class ApplicationStartListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    RedisCacheUtils redisCacheUtils;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("我的父容器为：" + contextRefreshedEvent.getApplicationContext().getParent());
        System.out.println("初始化时我被调用了。");
        // 父容器（Parent为null的容器）启动时将会执行相应的业务操作
        if(contextRefreshedEvent.getApplicationContext().getParent() == null){
            logger.info("dosomething!!!!!");
            redisCacheFlush();
        }
    }

    public void redisCacheFlush() {
//        RedisCacheUtils redisCacheUtils = new RedisCacheUtils();
        try {
            redisCacheUtils.redisCacheFlush();
        } catch (Exception e) {
            logger.info("加载缓存失败"+e.getMessage());
        }
    }
}
