package com.lc.model.entity;

import java.io.Serializable;

/**
* 实体类
 * <p>
 * id 主键<br>
 * articleTitle 文章标题<br>
 * articleHref 文章链接<br>
 * articleCategory 文章类别<br>
 * articleRemark 长文本说明<br>
 */
public class Article implements Serializable {
    /** 主键 */
    private String id;

    /** 文章标题 */
    private String articleTitle;

    /** 文章链接 */
    private String articleHref;

    /** 文章类别 */
    private String articleCategory;

    /** 长文本说明 */
    private String articleRemark;

    private static final long serialVersionUID = 1L;

    /**
     * 构造函数
     * <p>
     * 
     */ 
    public Article(String id, String articleTitle, String articleHref, String articleCategory) {
        this.id = id;
        this.articleTitle = articleTitle;
        this.articleHref = articleHref;
        this.articleCategory = articleCategory;
    }

    /**
     * 构造函数
     * <p>
     * 
     */ 
    public Article(String id, String articleTitle, String articleHref, String articleCategory, String articleRemark) {
        this.id = id;
        this.articleTitle = articleTitle;
        this.articleHref = articleHref;
        this.articleCategory = articleCategory;
        this.articleRemark = articleRemark;
    }

    /**
     * 构造函数
     * <p>
     * 
     */ 
    public Article() {
        super();
    }

    /**
     * 获取主键
     * <p>
     * 
     * @return 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     * <p>
     * 
     * @param id
     *               主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取文章标题
     * <p>
     * 
     * @return 文章标题
     */
    public String getArticleTitle() {
        return articleTitle;
    }

    /**
     * 设置文章标题
     * <p>
     * 
     * @param articleTitle
     *               文章标题
     */
    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    /**
     * 获取文章链接
     * <p>
     * 
     * @return 文章链接
     */
    public String getArticleHref() {
        return articleHref;
    }

    /**
     * 设置文章链接
     * <p>
     * 
     * @param articleHref
     *               文章链接
     */
    public void setArticleHref(String articleHref) {
        this.articleHref = articleHref;
    }

    /**
     * 获取文章类别
     * <p>
     * 
     * @return 文章类别
     */
    public String getArticleCategory() {
        return articleCategory;
    }

    /**
     * 设置文章类别
     * <p>
     * 
     * @param articleCategory
     *               文章类别
     */
    public void setArticleCategory(String articleCategory) {
        this.articleCategory = articleCategory;
    }

    /**
     * 获取长文本说明
     * <p>
     * 
     * @return 长文本说明
     */
    public String getArticleRemark() {
        return articleRemark;
    }

    /**
     * 设置长文本说明
     * <p>
     * 
     * @param articleRemark
     *               长文本说明
     */
    public void setArticleRemark(String articleRemark) {
        this.articleRemark = articleRemark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", articleTitle=").append(articleTitle);
        sb.append(", articleHref=").append(articleHref);
        sb.append(", articleCategory=").append(articleCategory);
        sb.append(", articleRemark=").append(articleRemark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}