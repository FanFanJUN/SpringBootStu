package com.lc.model;

/**
 * @ClassName BaseSearchBo
 * @Description 查询列表 基类
 * @Author licai
 * @Date 2020-09-01 10:35
 * @Version 1.0
 */
public  class BaseSearchBo {
    /**当前页码*/
    private int pageNum = 1;

    /**列表默认条数*/
    private int pageSize = 10;

    /**快速查询*/
    public  String quickSearchVqalue;

    public String getQuickSearchVqalue() {
        return quickSearchVqalue;
    }

    public void setQuickSearchVqalue(String quickSearchVqalue) {
        this.quickSearchVqalue = quickSearchVqalue;
    }
    
    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    
}
