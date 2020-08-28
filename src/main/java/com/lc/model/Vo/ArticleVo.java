package com.lc.model.Vo;

import java.io.Serializable;

/**
 * @ClassName ArticleVo
 * @Description TODO
 * @Author licai
 * @Date 2020-08-28 13:58
 * @Version 1.0
 */
public class ArticleVo implements Serializable {
    /** 主键 */
    private String id;

    /** 文章标题 */
    private String articleTitle;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleHref() {
        return articleHref;
    }

    public void setArticleHref(String articleHref) {
        this.articleHref = articleHref;
    }

    public String getArticleCategory() {
        return articleCategory;
    }

    public void setArticleCategory(String articleCategory) {
        this.articleCategory = articleCategory;
    }

    public String getArticleRemark() {
        return articleRemark;
    }

    public void setArticleRemark(String articleRemark) {
        this.articleRemark = articleRemark;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /** 文章链接 */
    private String articleHref;

    /** 文章类别 */
    private String articleCategory;

    /** 长文本说明 */
    private String articleRemark;
    
    
    private Integer pageNum;
    
    private  Integer pageSize;

    public ArticleVo(String id, String articleTitle, String articleHref, String articleCategory, String articleRemark, Integer pageNum, Integer pageSize) {
        this.id = id;
        this.articleTitle = articleTitle;
        this.articleHref = articleHref;
        this.articleCategory = articleCategory;
        this.articleRemark = articleRemark;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }
    
}
