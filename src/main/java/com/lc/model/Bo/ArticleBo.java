package com.lc.model.Bo;

/**
 * @ClassName ArticleBo
 * @Description 返回文章数量
 * @Author licai
 * @Date 2020-09-01 15:30
 * @Version 1.0
 */
public class ArticleBo {
    public String getTotalTitel() {
        return totalTitel;
    }

    public void setTotalTitel(String totalTitel) {
        this.totalTitel = totalTitel;
    }

    public String getArticleCategoryName() {
        return articleCategoryName;
    }

    public void setArticleCategoryName(String articleCategoryName) {
        this.articleCategoryName = articleCategoryName;
    }

    private  String totalTitel;


    private String articleCategoryName;
}
