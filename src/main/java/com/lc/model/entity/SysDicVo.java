package com.lc.model.entity;

import java.util.List;

public class SysDicVo extends SysDic {

    /** 字典类别编号集合 */
    private String dictionaryCategoryNos;
    private List<SysDicVo> projectIds;

    //    **
//            * 获取字典类别编号
//     * <p>
//     *
//             * @return 字典类别编号
//     */
    public String getDictionaryCategoryNos() {
        return dictionaryCategoryNos;
    }

    /**
     * 设置字典类别编号
     * <p>
     *
     * @param dictionaryCategoryNos
     *               字典类别编号集合
     */
    public void setDictionaryCategoryNos(String dictionaryCategoryNos) {
        this.dictionaryCategoryNos = dictionaryCategoryNos;
    }

    public List getProjectIds() {
        return projectIds;
    }

    public void setProjectIds(List<SysDicVo> projectIds) {
        this.projectIds = projectIds;
    }

}
