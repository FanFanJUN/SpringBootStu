package com.lc.common.utils;

import com.lc.common.ParamConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PropertiesUtils {
    @Autowired
    Environment environment;

    public List<String> getRedissonServerAddress() {
        List<String> list = new ArrayList<>();
        list.add(environment.getProperty(ParamConstant.REDIS_ADDRESS));
        return list;
    }
}
