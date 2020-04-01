package com.lc.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lc.common.CommonPage;
import com.lc.common.CommonResult;
import com.lc.common.IdUtils;
import com.lc.model.entity.TcRgtResource;
import com.lc.service.TcRgtResourceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TcRrgResourceController {

    @Resource
    TcRgtResourceService tcRgtResourceService;


    /**
     * 根据 resourceLvl 层级查询不同sql
     * @param tcRgtResource
     * @return
     */
    @PostMapping("/api/lc/RESOURCESELECTLIST")
    public CommonResult getResourceByResourceNo(@RequestBody TcRgtResource tcRgtResource){
        try {
            tcRgtResource.setResourceEffectFlg("1"); // 查询有效的资源||功能
            tcRgtResource.setResourceNo(tcRgtResource.getParentNo());
            return CommonResult.success(tcRgtResourceService.selectByResourceNo(tcRgtResource));
        } catch (Exception e) {
            return  CommonResult.failed("资源菜单获取失败");
        }
    }

    @PostMapping("/api/lc/RESOURCESTREEELECTLIST")
    public CommonResult getResourceByParentNo(@RequestBody TcRgtResource tcRgtResource) {
        try {
            tcRgtResource.setResourceEffectFlg("1"); // 查询有效的资源||功能
            return CommonResult.success(tcRgtResourceService.selectByParentNo(tcRgtResource));
        } catch (Exception e) {
            return CommonResult.failed("资源菜单获取失败");
        }
    }

    @PostMapping("/api/lc/RESOURCEBUTTON")
    public CommonResult getResourceButtonInfo(@RequestBody TcRgtResource tcRgtResource){
        try {
//            PageHelper.startPage(pageInfo.getPageNum(), pageInfo.getPageSize());
            return CommonResult.success(CommonPage.restPage(tcRgtResourceService.selectByParentNo(tcRgtResource)));
        } catch (Exception e) {
            return  CommonResult.failed("按钮权限信息获取失败");
        }
    }

    @PostMapping("/api/lc/RESOURCEINSERT")
    public CommonResult insertResource(@RequestBody TcRgtResource tcRgtResource) {
        tcRgtResource.setDelFlg("2");
        tcRgtResource.setStatus("1");
        tcRgtResource.setResourceEffectFlg("1");
        tcRgtResource.setResourceId(IdUtils.getRandomIdByUUID());
        try {
            return CommonResult.success(tcRgtResourceService.insertSelective(tcRgtResource), "新增成功");
        } catch (Exception E) {
            return  CommonResult.failed(E.toString());
        }
    }

    @PostMapping("/api/lc/RESOURCEDELETE")
    public CommonResult deleteResource(@RequestBody TcRgtResource tcRgtResource) {
        try {
            return CommonResult.success(tcRgtResourceService.deleteByPrimaryKey(tcRgtResource.getResourceId()), "删除成功");
        } catch (Exception E) {
            return  CommonResult.failed(E.toString());
        }
    }

    @PostMapping("/api/lc/RESOURCEUPDATE")
    public CommonResult updateResource(@RequestBody TcRgtResource tcRgtResource) {
        try {
            return CommonResult.success(tcRgtResourceService.updateByPrimaryKeySelective(tcRgtResource), "更新成功");
        } catch (Exception E) {
            return  CommonResult.failed(E.toString());
        }
    }
}
