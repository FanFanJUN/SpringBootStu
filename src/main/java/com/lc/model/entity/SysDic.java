package com.lc.model.entity;

import com.lc.model.BaseSearchBo;

import java.io.Serializable;
import java.util.Date;

/**
* 数据字典实体实体类
 * <p>
 * dictionaryNo 字典编号<br>
 * dictionaryCategoryNo 字典类别编号<br>
 * dictionaryNm 字典名字<br>
 * dictionaryCategoryNm 字典类别名字<br>
 * statusFlag 状态标志<br>
 * levelNo 级别编号<br>
 * sequenceNum 顺序数量<br>
 * systemNo 系统编号<br>
 * createUserNo 创建用户编号<br>
 * createOrgNo 创建机构编号<br>
 * updateUserNo 更新用户编号<br>
 * updateOrgNo 更新机构编号<br>
 * updateTimestmp 更新时间<br>
 * maintenanceDate 维护日期<br>
 * deleteFlag 删除标志<br>
 */
public class SysDic extends BaseSearchBo implements Serializable {
    /** 字典编号 */
    private String dictionaryNo;

    /** 字典类别编号 */
    private String dictionaryCategoryNo;

    /** 字典名字 */
    private String dictionaryNm;

    /** 字典类别名字 */
    private String dictionaryCategoryNm;

    /** 状态标志 */
    private String statusFlag;

    /** 级别编号 */
    private String levelNo;

    /** 顺序数量 */
    private String sequenceNum;

    /** 系统编号 */
    private String systemNo;

    /** 创建用户编号 */
    private String createUserNo;

    /** 创建机构编号 */
    private String createOrgNo;

    /** 更新用户编号 */
    private String updateUserNo;

    /** 更新机构编号 */
    private String updateOrgNo;

    /** 更新时间 */
    private Date updateTimestmp;

    /** 维护日期 */
    private String maintenanceDate;

    /** 删除标志 */
    private String deleteFlag;

    private static final long serialVersionUID = 1L;

    /**
     * 数据字典实体构造函数
     * <p>
     * 
     */ 
    public SysDic(String dictionaryNo, String dictionaryCategoryNo, String dictionaryNm, String dictionaryCategoryNm, String statusFlag, String levelNo, String sequenceNum, String systemNo, String createUserNo, String createOrgNo, String updateUserNo, String updateOrgNo, Date updateTimestmp, String maintenanceDate, String deleteFlag) {
        this.dictionaryNo = dictionaryNo;
        this.dictionaryCategoryNo = dictionaryCategoryNo;
        this.dictionaryNm = dictionaryNm;
        this.dictionaryCategoryNm = dictionaryCategoryNm;
        this.statusFlag = statusFlag;
        this.levelNo = levelNo;
        this.sequenceNum = sequenceNum;
        this.systemNo = systemNo;
        this.createUserNo = createUserNo;
        this.createOrgNo = createOrgNo;
        this.updateUserNo = updateUserNo;
        this.updateOrgNo = updateOrgNo;
        this.updateTimestmp = updateTimestmp;
        this.maintenanceDate = maintenanceDate;
        this.deleteFlag = deleteFlag;
    }

    /**
     * 数据字典实体构造函数
     * <p>
     * 
     */ 
    public SysDic() {
        super();
    }

    /**
     * 获取字典编号
     * <p>
     * 
     * @return 字典编号
     */
    public String getDictionaryNo() {
        return dictionaryNo;
    }

    /**
     * 设置字典编号
     * <p>
     * 
     * @param dictionaryNo
     *               字典编号
     */
    public void setDictionaryNo(String dictionaryNo) {
        this.dictionaryNo = dictionaryNo;
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
     * 获取字典名字
     * <p>
     * 
     * @return 字典名字
     */
    public String getDictionaryNm() {
        return dictionaryNm;
    }

    /**
     * 设置字典名字
     * <p>
     * 
     * @param dictionaryNm
     *               字典名字
     */
    public void setDictionaryNm(String dictionaryNm) {
        this.dictionaryNm = dictionaryNm;
    }

    /**
     * 获取字典类别名字
     * <p>
     * 
     * @return 字典类别名字
     */
    public String getDictionaryCategoryNm() {
        return dictionaryCategoryNm;
    }

    /**
     * 设置字典类别名字
     * <p>
     * 
     * @param dictionaryCategoryNm
     *               字典类别名字
     */
    public void setDictionaryCategoryNm(String dictionaryCategoryNm) {
        this.dictionaryCategoryNm = dictionaryCategoryNm;
    }

    /**
     * 获取状态标志
     * <p>
     * 
     * @return 状态标志
     */
    public String getStatusFlag() {
        return statusFlag;
    }

    /**
     * 设置状态标志
     * <p>
     * 
     * @param statusFlag
     *               状态标志
     */
    public void setStatusFlag(String statusFlag) {
        this.statusFlag = statusFlag;
    }

    /**
     * 获取级别编号
     * <p>
     * 
     * @return 级别编号
     */
    public String getLevelNo() {
        return levelNo;
    }

    /**
     * 设置级别编号
     * <p>
     * 
     * @param levelNo
     *               级别编号
     */
    public void setLevelNo(String levelNo) {
        this.levelNo = levelNo;
    }

    /**
     * 获取顺序数量
     * <p>
     * 
     * @return 顺序数量
     */
    public String getSequenceNum() {
        return sequenceNum;
    }

    /**
     * 设置顺序数量
     * <p>
     * 
     * @param sequenceNum
     *               顺序数量
     */
    public void setSequenceNum(String sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    /**
     * 获取系统编号
     * <p>
     * 
     * @return 系统编号
     */
    public String getSystemNo() {
        return systemNo;
    }

    /**
     * 设置系统编号
     * <p>
     * 
     * @param systemNo
     *               系统编号
     */
    public void setSystemNo(String systemNo) {
        this.systemNo = systemNo;
    }

    /**
     * 获取创建用户编号
     * <p>
     * 
     * @return 创建用户编号
     */
    public String getCreateUserNo() {
        return createUserNo;
    }

    /**
     * 设置创建用户编号
     * <p>
     * 
     * @param createUserNo
     *               创建用户编号
     */
    public void setCreateUserNo(String createUserNo) {
        this.createUserNo = createUserNo;
    }

    /**
     * 获取创建机构编号
     * <p>
     * 
     * @return 创建机构编号
     */
    public String getCreateOrgNo() {
        return createOrgNo;
    }

    /**
     * 设置创建机构编号
     * <p>
     * 
     * @param createOrgNo
     *               创建机构编号
     */
    public void setCreateOrgNo(String createOrgNo) {
        this.createOrgNo = createOrgNo;
    }

    /**
     * 获取更新用户编号
     * <p>
     * 
     * @return 更新用户编号
     */
    public String getUpdateUserNo() {
        return updateUserNo;
    }

    /**
     * 设置更新用户编号
     * <p>
     * 
     * @param updateUserNo
     *               更新用户编号
     */
    public void setUpdateUserNo(String updateUserNo) {
        this.updateUserNo = updateUserNo;
    }

    /**
     * 获取更新机构编号
     * <p>
     * 
     * @return 更新机构编号
     */
    public String getUpdateOrgNo() {
        return updateOrgNo;
    }

    /**
     * 设置更新机构编号
     * <p>
     * 
     * @param updateOrgNo
     *               更新机构编号
     */
    public void setUpdateOrgNo(String updateOrgNo) {
        this.updateOrgNo = updateOrgNo;
    }

    /**
     * 获取更新时间
     * <p>
     * 
     * @return 更新时间
     */
    public Date getUpdateTimestmp() {
        return updateTimestmp;
    }

    /**
     * 设置更新时间
     * <p>
     * 
     * @param updateTimestmp
     *               更新时间
     */
    public void setUpdateTimestmp(Date updateTimestmp) {
        this.updateTimestmp = updateTimestmp;
    }

    /**
     * 获取维护日期
     * <p>
     * 
     * @return 维护日期
     */
    public String getMaintenanceDate() {
        return maintenanceDate;
    }

    /**
     * 设置维护日期
     * <p>
     * 
     * @param maintenanceDate
     *               维护日期
     */
    public void setMaintenanceDate(String maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }

    /**
     * 获取删除标志
     * <p>
     * 
     * @return 删除标志
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * 设置删除标志
     * <p>
     * 
     * @param deleteFlag
     *               删除标志
     */
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dictionaryNo=").append(dictionaryNo);
        sb.append(", dictionaryCategoryNo=").append(dictionaryCategoryNo);
        sb.append(", dictionaryNm=").append(dictionaryNm);
        sb.append(", dictionaryCategoryNm=").append(dictionaryCategoryNm);
        sb.append(", statusFlag=").append(statusFlag);
        sb.append(", levelNo=").append(levelNo);
        sb.append(", sequenceNum=").append(sequenceNum);
        sb.append(", systemNo=").append(systemNo);
        sb.append(", createUserNo=").append(createUserNo);
        sb.append(", createOrgNo=").append(createOrgNo);
        sb.append(", updateUserNo=").append(updateUserNo);
        sb.append(", updateOrgNo=").append(updateOrgNo);
        sb.append(", updateTimestmp=").append(updateTimestmp);
        sb.append(", maintenanceDate=").append(maintenanceDate);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}