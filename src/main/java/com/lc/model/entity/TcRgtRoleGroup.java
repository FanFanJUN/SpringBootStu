package com.lc.model.entity;

import java.io.Serializable;
import java.util.Date;

/**
* 角色表实体类
 * <p>
 * roleId 角色ID<br>
 * sysId 系统ID<br>
 * roleNo 角色编号<br>
 * roleNm 角色名称<br>
 * roleGropNo 角色组编号<br>
 * createUserNo 创建用户编号<br>
 * createOrgNo 创建机构编号<br>
 * updateUserNo 更新用户编号<br>
 * updateOrgNo 更新机构编号<br>
 * updateTimestmp 更新时间<br>
 * maintenanceDate 维护日期<br>
 * status 状态标志<br>
 * delFlg 删除标志<br>
 */
public class TcRgtRoleGroup implements Serializable {
    /** 角色ID */
    private String roleId;

    /** 系统ID */
    private String sysId;

    /** 角色编号 */
    private String roleNo;

    /** 角色名称 */
    private String roleNm;

    /** 角色组编号 */
    private String roleGropNo;

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

    /** 状态标志 */
    private String status;

    /** 删除标志 */
    private String delFlg;

    private static final long serialVersionUID = 1L;

    /**
     * 角色表构造函数
     * <p>
     * 
     */ 
    public TcRgtRoleGroup(String roleId, String sysId, String roleNo, String roleNm, String roleGropNo, String createUserNo, String createOrgNo, String updateUserNo, String updateOrgNo, Date updateTimestmp, String maintenanceDate, String status, String delFlg) {
        this.roleId = roleId;
        this.sysId = sysId;
        this.roleNo = roleNo;
        this.roleNm = roleNm;
        this.roleGropNo = roleGropNo;
        this.createUserNo = createUserNo;
        this.createOrgNo = createOrgNo;
        this.updateUserNo = updateUserNo;
        this.updateOrgNo = updateOrgNo;
        this.updateTimestmp = updateTimestmp;
        this.maintenanceDate = maintenanceDate;
        this.status = status;
        this.delFlg = delFlg;
    }

    /**
     * 角色表构造函数
     * <p>
     * 
     */ 
    public TcRgtRoleGroup() {
        super();
    }

    /**
     * 获取角色ID
     * <p>
     * 
     * @return 角色ID
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 设置角色ID
     * <p>
     * 
     * @param roleId
     *               角色ID
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取系统ID
     * <p>
     * 
     * @return 系统ID
     */
    public String getSysId() {
        return sysId;
    }

    /**
     * 设置系统ID
     * <p>
     * 
     * @param sysId
     *               系统ID
     */
    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    /**
     * 获取角色编号
     * <p>
     * 
     * @return 角色编号
     */
    public String getRoleNo() {
        return roleNo;
    }

    /**
     * 设置角色编号
     * <p>
     * 
     * @param roleNo
     *               角色编号
     */
    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
    }

    /**
     * 获取角色名称
     * <p>
     * 
     * @return 角色名称
     */
    public String getRoleNm() {
        return roleNm;
    }

    /**
     * 设置角色名称
     * <p>
     * 
     * @param roleNm
     *               角色名称
     */
    public void setRoleNm(String roleNm) {
        this.roleNm = roleNm;
    }

    /**
     * 获取角色组编号
     * <p>
     * 
     * @return 角色组编号
     */
    public String getRoleGropNo() {
        return roleGropNo;
    }

    /**
     * 设置角色组编号
     * <p>
     * 
     * @param roleGropNo
     *               角色组编号
     */
    public void setRoleGropNo(String roleGropNo) {
        this.roleGropNo = roleGropNo;
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
     * 获取状态标志
     * <p>
     * 
     * @return 状态标志
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态标志
     * <p>
     * 
     * @param status
     *               状态标志
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取删除标志
     * <p>
     * 
     * @return 删除标志
     */
    public String getDelFlg() {
        return delFlg;
    }

    /**
     * 设置删除标志
     * <p>
     * 
     * @param delFlg
     *               删除标志
     */
    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", sysId=").append(sysId);
        sb.append(", roleNo=").append(roleNo);
        sb.append(", roleNm=").append(roleNm);
        sb.append(", roleGropNo=").append(roleGropNo);
        sb.append(", createUserNo=").append(createUserNo);
        sb.append(", createOrgNo=").append(createOrgNo);
        sb.append(", updateUserNo=").append(updateUserNo);
        sb.append(", updateOrgNo=").append(updateOrgNo);
        sb.append(", updateTimestmp=").append(updateTimestmp);
        sb.append(", maintenanceDate=").append(maintenanceDate);
        sb.append(", status=").append(status);
        sb.append(", delFlg=").append(delFlg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}