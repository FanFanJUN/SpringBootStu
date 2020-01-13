package com.lc.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author lc
 */
public class Configure extends PropertyPlaceholderConfigurer {
    private static final Logger LOG = LoggerFactory.getLogger(Configure.class);
    private static Properties props;
    private static Map<String, String> ctxPropMap;

    @Override
    protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props) throws BeansException {
        super.processProperties(beanFactoryToProcess, props);
        ctxPropMap = new HashMap<>();
        for(Object key: props.keySet()) {
            String keyStr = key.toString();
            String value = String.valueOf(props.get(keyStr));
            ctxPropMap.put(keyStr, value);
        }
    }

    public static  String get(String name) {
        return ctxPropMap.get(name);
    }

    public static String get(String name, String defaultValue) {
        String valueString = get(name);
        if(valueString == null) {
            return  defaultValue;
        }
        try{
            return valueString;
        } catch (NumberFormatException e) {
            return  defaultValue;
        }
    }

    public static Map<String, String> getMap() {
        return ctxPropMap;
    }
}
