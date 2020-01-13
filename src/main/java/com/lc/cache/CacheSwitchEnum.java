package com.lc.cache;

public enum CacheSwitchEnum {
    /**
     * 缓存开关枚举
     */
    ON("on", "开"),
    OFF("off", "关");

    private String code;
    private String desc;

    private CacheSwitchEnum(String  code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
