package com.lc.model.Bo.base;

import java.io.Serializable;

public abstract class BaseBo implements Serializable{
    /**
     * 主键
     */
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
