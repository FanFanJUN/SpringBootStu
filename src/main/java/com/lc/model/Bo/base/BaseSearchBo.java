package com.lc.model.Bo.base;

public abstract class BaseSearchBo extends BaseBo{
    /**
     * 当前页码
     */
    private int page = 1;
    /**
     * 每页条数,默认每页10条
     */
    private int rows = 10;


    public abstract String getQuickSearchValue();

    public abstract void setQuickSearchValue(String quickSearchValue);

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

}
