package com.lc.model.entity;

import java.io.Serializable;

/**
* 测试用户表实体类
 * <p>
 * id id<br>
 * name 姓名//姓名<br>
 * password 密码//密码<br>
 * sex 性别//性别<br>
 * idnumber ID识别号//ID识别号<br>
 * description 描述//描述<br>
 * birthdate 生日//生日<br>
 */
public class TestUser implements Serializable {
    /**id */
    private Integer id;

    /**姓名//姓名 */
    private String name;

    /**密码//密码 */
    private String password;

    /**性别//性别 */
    private String sex;

    /**ID识别号//ID识别号 */
    private Integer idnumber;

    /**描述//描述 */
    private String description;

    /**生日//生日 */
    private String birthdate;

    private static final long serialVersionUID = 1L;

    /**
     * 测试用户表构造函数
     * <p>
     * 
     */ 
    public TestUser(Integer id, String name, String password, String sex, Integer idnumber, String description, String birthdate) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.idnumber = idnumber;
        this.description = description;
        this.birthdate = birthdate;
    }

    /**
     * 测试用户表构造函数
     * <p>
     * 
     */ 
    public TestUser() {
        super();
    }

    /**
     * 获取id
     * <p>
     * 
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     * <p>
     * 
     * @param id
     *               id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取姓名//姓名
     * <p>
     * 
     * @return 姓名//姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名//姓名
     * <p>
     * 
     * @param name
     *               姓名//姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取密码//密码
     * <p>
     * 
     * @return 密码//密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码//密码
     * <p>
     * 
     * @param password
     *               密码//密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取性别//性别
     * <p>
     * 
     * @return 性别//性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别//性别
     * <p>
     * 
     * @param sex
     *               性别//性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取ID识别号//ID识别号
     * <p>
     * 
     * @return ID识别号//ID识别号
     */
    public Integer getIdnumber() {
        return idnumber;
    }

    /**
     * 设置ID识别号//ID识别号
     * <p>
     * 
     * @param idnumber
     *               ID识别号//ID识别号
     */
    public void setIdnumber(Integer idnumber) {
        this.idnumber = idnumber;
    }

    /**
     * 获取描述//描述
     * <p>
     * 
     * @return 描述//描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述//描述
     * <p>
     * 
     * @param description
     *               描述//描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取生日//生日
     * <p>
     * 
     * @return 生日//生日
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * 设置生日//生日
     * <p>
     * 
     * @param birthdate
     *               生日//生日
     */
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", sex=").append(sex);
        sb.append(", idnumber=").append(idnumber);
        sb.append(", description=").append(description);
        sb.append(", birthdate=").append(birthdate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}