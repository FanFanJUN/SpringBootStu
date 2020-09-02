package com.lc.model.entity;

import com.lc.model.BaseSearchBo;

import java.io.Serializable;
import java.util.Date;

/**
* 字典类别表实体类
 * <p>
 * id 主键<br>
 * dictionaryCategoryNo 字典类别编号<br>
 * dictionaryCategoryNm 字典类别名称<br>
 * createTime 创建时间<br>
 * deleteFlag 是否删除标志<br>
 * freezeFlag 是否冻结标志<br>
 */
public class SysDicCategory extends BaseSearchBo implements Serializable {
    /** 主键 */
    private String id;

    /** 字典类别编号 */
    private String dictionaryCategoryNo;

    /** 字典类别名称 */
    private String dictionaryCategoryNm;

    /** 创建时间 */
    private Date createTime;

    /** 是否删除标志 */
    private String deleteFlag;

    /** 是否冻结标志 */
    private String freezeFlag;

    private static final long serialVersionUID = 1L;

    /**
     * 字典类别表构造函数
     * <p>
     * 
     */ 
    public SysDicCategory(String id, String dictionaryCategoryNo, String dictionaryCategoryNm, Date createTime, String deleteFlag, String freezeFlag) {
        this.id = id;
        this.dictionaryCategoryNo = dictionaryCategoryNo;
        this.dictionaryCategoryNm = dictionaryCategoryNm;
        this.createTime = createTime;
        this.deleteFlag = deleteFlag;
        this.freezeFlag = freezeFlag;
    }

    /**
     * 字典类别表构造函数
     * <p>
     * 
     */ 
    public SysDicCategory() {
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
     * 获取字典类别编号
     * <p>
     * 
     * @return 字典类别编号
     */
    public String getDictionaryCategoryNo() {
        return dictionaryCategoryNo;
    }

    /**
     * 设置字典类别编号
     * <p>
     * 
     * @param dictionaryCategoryNo
     *               字典类别编号
     */
    public void setDictionaryCategoryNo(String dictionaryCategoryNo) {
        this.dictionaryCategoryNo = dictionaryCategoryNo;
    }

    /**
     * 获取字典类别名称
     * <p>
     * 
     * @return 字典类别名称
     */
    public String getDictionaryCategoryNm() {
        return dictionaryCategoryNm;
    }

    /**
     * 设置字典类别名称
     * <p>
     * 
     * @param dictionaryCategoryNm
     *               字典类别名称
     */
    public void setDictionaryCategoryNm(String dictionaryCategoryNm) {
        this.dictionaryCategoryNm = dictionaryCategoryNm;
    }

    /**
     * 获取创建时间
     * <p>
     * 
     * @return 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     * <p>
     * 
     * @param createTime
     *               创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取是否删除标志
     * <p>
     * 
     * @return 是否删除标志
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * 设置是否删除标志
     * <p>
     * 
     * @param deleteFlag
     *               是否删除标志
     */
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * 获取是否冻结标志
     * <p>
     * 
     * @return 是否冻结标志
     */
    public String getFreezeFlag() {
        return freezeFlag;
    }

    /**
     * 设置是否冻结标志
     * <p>
     * 
     * @param freezeFlag
     *               是否冻结标志
     */
    public void setFreezeFlag(String freezeFlag) {
        this.freezeFlag = freezeFlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dictionaryCategoryNo=").append(dictionaryCategoryNo);
        sb.append(", dictionaryCategoryNm=").append(dictionaryCategoryNm);
        sb.append(", createTime=").append(createTime);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", freezeFlag=").append(freezeFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}