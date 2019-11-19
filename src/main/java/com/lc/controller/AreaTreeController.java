package com.lc.controller;

import com.lc.common.CommonResult;
import com.lc.model.entity.SysTreeDic;
import com.lc.service.AreaTreeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 区域树查询
 */
@RestController
public class AreaTreeController {

    @Resource
    AreaTreeService areaTreeService;


    @PostMapping("/api/lc/SELECTAREATREE")
    public CommonResult selectTree(@RequestBody SysTreeDic treeDic){
        try {
            return CommonResult.success(areaTreeService.selectTreeNodes(treeDic));
        } catch (Exception e) {
            return CommonResult.failed(e.toString());
        }
    }

}
