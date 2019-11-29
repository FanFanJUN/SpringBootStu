package com.lc.model.entity;

import java.io.Serializable;
import java.util.Date;

/**
* 菜单资源表实体类
 * <p>
 * resourceId 资源ID<br>
 * resourceNm 资源名称<br>
 * resourceNo 资源编号<br>
 * resourceTp 资源类型<br>
 * resourceEffectFlg 资源有效标识<br>
 * parentNo 资源父级编号<br>
 * resourceLvl 资源层级<br>
 * resourceOrd 资源顺序<br>
 * parentNm 资源父级名称<br>
 * hideInMenu 是否隐藏<br>
 * hideChildrenInMenu 是否隐藏子<br>
 * status 状态标志<br>
 * delFlg 删除标志<br>
 * sysId 系统编号<br>
 * resourcePath 资源路径<br>
 * resourceIcon 资源图标<br>
 * location 资源完整路径<br>
 * isLeaf 是否叶子节点<br>
 * createUserNo 创建用户编号<br>
 * createOrgNo 创建机构编号<br>
 * updateUserNo 更新用户编号<br>
 * updateOrgNo 更新机构编号<br>
 * updateTimestmp 更新时间<br>
 * maintenanceDate 维护日期<br>
 */
public class TcRgtResource implements Serializable {
    /** 资源ID */
    private String resourceId;

    /** 资源名称 */
    private String resourceNm;

    /** 资源编号 */
    private String resourceNo;

    /** 资源类型 */
    private String resourceTp;

    /** 资源有效标识 */
    private String resourceEffectFlg;

    /** 资源父级编号 */
    private String parentNo;

    /** 资源层级 */
    private String resourceLvl;

    /** 资源顺序 */
    private String resourceOrd;

    /** 资源父级名称 */
    private String parentNm;

    /** 是否隐藏 */
    private String hideInMenu;

    /** 是否隐藏子 */
    private String hideChildrenInMenu;

    /** 状态标志 */
    private String status;

    /** 删除标志 */
    private String delFlg;

    /** 系统编号 */
    private String sysId;

    /** 资源路径 */
    private String resourcePath;

    /** 资源图标 */
    private String resourceIcon;

    /** 资源完整路径 */
    private String location;

    /** 是否叶子节点 */
    private String isLeaf;

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

    private static final long serialVersionUID = 1L;

    /**
     * 菜单资源表构造函数
     * <p>
     * 
     */ 
    public TcRgtResource(String resourceId, String resourceNm, String resourceNo, String resourceTp, String resourceEffectFlg, String parentNo, String resourceLvl, String resourceOrd, String parentNm, String hideInMenu, String hideChildrenInMenu, String status, String delFlg, String sysId, String resourcePath, String resourceIcon, String location, String isLeaf, String createUserNo, String createOrgNo, String updateUserNo, String updateOrgNo, Date updateTimestmp, String maintenanceDate) {
        this.resourceId = resourceId;
        this.resourceNm = resourceNm;
        this.resourceNo = resourceNo;
        this.resourceTp = resourceTp;
        this.resourceEffectFlg = resourceEffectFlg;
        this.parentNo = parentNo;
        this.resourceLvl = resourceLvl;
        this.resourceOrd = resourceOrd;
        this.parentNm = parentNm;
        this.hideInMenu = hideInMenu;
        this.hideChildrenInMenu = hideChildrenInMenu;
        this.status = status;
        this.delFlg = delFlg;
        this.sysId = sysId;
        this.resourcePath = resourcePath;
        this.resourceIcon = resourceIcon;
        this.location = location;
        this.isLeaf = isLeaf;
        this.createUserNo = createUserNo;
        this.createOrgNo = createOrgNo;
        this.updateUserNo = updateUserNo;
        this.updateOrgNo = updateOrgNo;
        this.updateTimestmp = updateTimestmp;
        this.maintenanceDate = maintenanceDate;
    }

    /**
     * 菜单资源表构造函数
     * <p>
     * 
     */ 
    public TcRgtResource() {
        super();
    }

    /**
     * 获取资源ID
     * <p>
     * 
     * @return 资源ID
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * 设置资源ID
     * <p>
     * 
     * @param resourceId
     *               资源ID
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * 获取资源名称
     * <p>
     * 
     * @return 资源名称
     */
    public String getResourceNm() {
        return resourceNm;
    }

    /**
     * 设置资源名称
     * <p>
     * 
     * @param resourceNm
     *               资源名称
     */
    public void setResourceNm(String resourceNm) {
        this.resourceNm = resourceNm;
    }

    /**
     * 获取资源编号
     * <p>
     * 
     * @return 资源编号
     */
    public String getResourceNo() {
        return resourceNo;
    }

    /**
     * 设置资源编号
     * <p>
     * 
     * @param resourceNo
     *               资源编号
     */
    public void setResourceNo(String resourceNo) {
        this.resourceNo = resourceNo;
    }

    /**
     * 获取资源类型
     * <p>
     * 
     * @return 资源类型
     */
    public String getResourceTp() {
        return resourceTp;
    }

    /**
     * 设置资源类型
     * <p>
     * 
     * @param resourceTp
     *               资源类型
     */
    public void setResourceTp(String resourceTp) {
        this.resourceTp = resourceTp;
    }

    /**
     * 获取资源有效标识
     * <p>
     * 
     * @return 资源有效标识
     */
    public String getResourceEffectFlg() {
        return resourceEffectFlg;
    }

    /**
     * 设置资源有效标识
     * <p>
     * 
     * @param resourceEffectFlg
     *               资源有效标识
     */
    public void setResourceEffectFlg(String resourceEffectFlg) {
        this.resourceEffectFlg = resourceEffectFlg;
    }

    /**
     * 获取资源父级编号
     * <p>
     * 
     * @return 资源父级编号
     */
    public String getParentNo() {
        return parentNo;
    }

    /**
     * 设置资源父级编号
     * <p>
     * 
     * @param parentNo
     *               资源父级编号
     */
    public void setParentNo(String parentNo) {
        this.parentNo = parentNo;
    }

    /**
     * 获取资源层级
     * <p>
     * 
     * @return 资源层级
     */
    public String getResourceLvl() {
        return resourceLvl;
    }

    /**
     * 设置资源层级
     * <p>
     * 
     * @param resourceLvl
     *               资源层级
     */
    public void setResourceLvl(String resourceLvl) {
        this.resourceLvl = resourceLvl;
    }

    /**
     * 获取资源顺序
     * <p>
     * 
     * @return 资源顺序
     */
    public String getResourceOrd() {
        return resourceOrd;
    }

    /**
     * 设置资源顺序
     * <p>
     * 
     * @param resourceOrd
     *               资源顺序
     */
    public void setResourceOrd(String resourceOrd) {
        this.resourceOrd = resourceOrd;
    }

    /**
     * 获取资源父级名称
     * <p>
     * 
     * @return 资源父级名称
     */
    public String getParentNm() {
        return parentNm;
    }

    /**
     * 设置资源父级名称
     * <p>
     * 
     * @param parentNm
     *               资源父级名称
     */
    public void setParentNm(String parentNm) {
        this.parentNm = parentNm;
    }

    /**
     * 获取是否隐藏
     * <p>
     * 
     * @return 是否隐藏
     */
    public String getHideInMenu() {
        return hideInMenu;
    }

    /**
     * 设置是否隐藏
     * <p>
     * 
     * @param hideInMenu
     *               是否隐藏
     */
    public void setHideInMenu(String hideInMenu) {
        this.hideInMenu = hideInMenu;
    }

    /**
     * 获取是否隐藏子
     * <p>
     * 
     * @return 是否隐藏子
     */
    public String getHideChildrenInMenu() {
        return hideChildrenInMenu;
    }

    /**
     * 设置是否隐藏子
     * <p>
     * 
     * @param hideChildrenInMenu
     *               是否隐藏子
     */
    public void setHideChildrenInMenu(String hideChildrenInMenu) {
        this.hideChildrenInMenu = hideChildrenInMenu;
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

    /**
     * 获取系统编号
     * <p>
     * 
     * @return 系统编号
     */
    public String getSysId() {
        return sysId;
    }

    /**
     * 设置系统编号
     * <p>
     * 
     * @param sysId
     *               系统编号
     */
    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    /**
     * 获取资源路径
     * <p>
     * 
     * @return 资源路径
     */
    public String getResourcePath() {
        return resourcePath;
    }

    /**
     * 设置资源路径
     * <p>
     * 
     * @param resourcePath
     *               资源路径
     */
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    /**
     * 获取资源图标
     * <p>
     * 
     * @return 资源图标
     */
    public String getResourceIcon() {
        return resourceIcon;
    }

    /**
     * 设置资源图标
     * <p>
     * 
     * @param resourceIcon
     *               资源图标
     */
    public void setResourceIcon(String resourceIcon) {
        this.resourceIcon = resourceIcon;
    }

    /**
     * 获取资源完整路径
     * <p>
     * 
     * @return 资源完整路径
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置资源完整路径
     * <p>
     * 
     * @param location
     *               资源完整路径
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 获取是否叶子节点
     * <p>
     * 
     * @return 是否叶子节点
     */
    public String getIsLeaf() {
        return isLeaf;
    }

    /**
     * 设置是否叶子节点
     * <p>
     * 
     * @param isLeaf
     *               是否叶子节点
     */
    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", resourceId=").append(resourceId);
        sb.append(", resourceNm=").append(resourceNm);
        sb.append(", resourceNo=").append(resourceNo);
        sb.append(", resourceTp=").append(resourceTp);
        sb.append(", resourceEffectFlg=").append(resourceEffectFlg);
        sb.append(", parentNo=").append(parentNo);
        sb.append(", resourceLvl=").append(resourceLvl);
        sb.append(", resourceOrd=").append(resourceOrd);
        sb.append(", parentNm=").append(parentNm);
        sb.append(", hideInMenu=").append(hideInMenu);
        sb.append(", hideChildrenInMenu=").append(hideChildrenInMenu);
        sb.append(", status=").append(status);
        sb.append(", delFlg=").append(delFlg);
        sb.append(", sysId=").append(sysId);
        sb.append(", resourcePath=").append(resourcePath);
        sb.append(", resourceIcon=").append(resourceIcon);
        sb.append(", location=").append(location);
        sb.append(", isLeaf=").append(isLeaf);
        sb.append(", createUserNo=").append(createUserNo);
        sb.append(", createOrgNo=").append(createOrgNo);
        sb.append(", updateUserNo=").append(updateUserNo);
        sb.append(", updateOrgNo=").append(updateOrgNo);
        sb.append(", updateTimestmp=").append(updateTimestmp);
        sb.append(", maintenanceDate=").append(maintenanceDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}