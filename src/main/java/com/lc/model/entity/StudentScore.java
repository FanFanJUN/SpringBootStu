package com.lc.model.entity;

import java.math.BigDecimal;

/**
 * @ClassName StudentScore
 * @Description TODO
 * @Author licai
 * @Date 2020-09-07 09:59
 * @Version 1.0
 */
public class StudentScore {
    private String stuName;
    
    private String subJect;
    
    private Integer score;
    
    private BigDecimal money;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getSubJect() {
        return subJect;
    }

    public void setSubJect(String subJect) {
        this.subJect = subJect;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
