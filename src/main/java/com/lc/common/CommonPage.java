package com.lc.common;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 分页数据封装类
 * Created by macro on 2019/4/19.
 */
public class CommonPage<T> {
    private Integer pageNum;
    private Integer pageSize;
    private Integer totalPage;
    private Long total;
    private List<T> list;

    /**
     * 将PageHelper分页后的list转为分页信息
     */
    public static <T> Map restPage(List<T> list) {
        CommonPage<T> result = new CommonPage<T>();
        PageInfo<T> pageInfo = new PageInfo<T>(list);
//        result.setTotalPage(pageInfo.getPages());
//        result.setPageNum(pageInfo.getPageNum());
//        result.setPageSize(pageInfo.getPageSize());
//        result.setTotal(pageInfo.getTotal());
//        result.setList(pageInfo.getList());
        Map pageMap = new HashMap();
        pageMap.put("total", pageInfo.getTotal()); // 总页数
        pageMap.put("current", pageInfo.getPageNum()); // 第几页
        pageMap.put("pageSize", pageInfo.getPageSize()); // 查询条数

        Map dataMap = new HashMap();
        dataMap.put("dataSource", pageInfo.getList());
        dataMap.put("pagination", pageMap);

//        HashMap map = new HashMap();
//        map.put("ResponseBody",dataMap);
        return dataMap;
    }

    /**
     * 将SpringData分页后的list转为分页信息
     */
//    public static <T> CommonPage<T> restPage(Page<T> pageInfo) {
//        CommonPage<T> result = new CommonPage<T>();
//        result.setTotalPage(pageInfo.getTotalPages());
//        result.setPageNum(pageInfo.getNumber());
//        result.setPageSize(pageInfo.getSize());
//        result.setTotal(pageInfo.getTotalElements());
//        result.setList(pageInfo.getContent());
//        return result;
//    }

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

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
