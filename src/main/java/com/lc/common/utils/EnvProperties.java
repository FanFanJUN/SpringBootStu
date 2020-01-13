package com.lc.common.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EnvProperties {

    @Value("${cache.switch}")
    private String CacheSwitch;

    public String getCacheSwitch() {
        return CacheSwitch;
    }

    public void setCacheSwitch(String cacheSwitch) {
        CacheSwitch = cacheSwitch;
    }
}
