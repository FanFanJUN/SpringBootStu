package com.lc.common.utils;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Properties;

/**
 * 获取properties工具方法
 */
public class PropertiesUtils {

    private static Properties properties;

    static {
        String fileName = "application.properties";
        properties = new Properties();
        try {
            properties.load(new InputStreamReader(
                    Objects.requireNonNull(PropertiesUtils
                                    .class
                                    .getClassLoader()
                                    .getResourceAsStream(fileName),
                            "当前配置文件不存在"), StandardCharsets.UTF_8));
        } catch (Exception e) {
//            log.error("读取配置文件: {} 失败", fileName, e);
        }
    }

    /**
     * <h2>获取配置文件的值</h2>
     *
     * @param key 配置键
     * @return key 对应的值
     */
    public static String getProperty(String key) {
        if (Objects.isNull(key)) {
            return null;
        }
        String value = properties.getProperty(key.trim());
        if (Objects.isNull(value)) {
            return null;
        }
        return value.trim();
    }


    /**
     * <h2>获取配置文件的值</h2>
     *
     * @param key          配置键
     * @param defaultValue key不存在或者对应的值不存在，返回的默认值
     * @return key 对应的值
     */
    public static String getProperty(String key, String defaultValue) {
        if (Objects.isNull(key)) {
            return defaultValue;
        }
        String value = properties.getProperty(key.trim());
        if (Objects.isNull(value)) {
            return defaultValue;
        }
        return value.trim();
    }

    public static void main(String[] args) {
        System.out.println(PropertiesUtils.getProperty("cache.switch"));
    }
}
