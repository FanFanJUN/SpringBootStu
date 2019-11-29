package com.lc.controller;


import com.lc.common.CommonResult;
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


    @PostMapping("/api/lc/RESOURCESELECTLIST")
    public CommonResult getResourceByParentNo(@RequestBody TcRgtResource tcRgtResource){
        try {
            return CommonResult.success(tcRgtResourceService.selectByParentNo(tcRgtResource));
        } catch (Exception e) {
            return  CommonResult.failed("资源菜单获取失败");
        }
    }
}
