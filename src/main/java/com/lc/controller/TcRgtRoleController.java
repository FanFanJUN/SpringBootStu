package com.lc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lc.common.CommonPage;
import com.lc.common.CommonResult;
import com.lc.model.entity.TcRgtRoleGroup;
import com.lc.service.TcRgtRoleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TcRgtRoleController {
    @Resource
    TcRgtRoleService tcRgtRoleService;

    @PostMapping("/api/lc/TCRGTROLESELECTLIST")
    public CommonResult selectRoleList(@RequestBody PageInfo pageInfo) {
        try {
            PageHelper.startPage(pageInfo.getPageNum(), pageInfo.getPageSize());
          return   CommonResult.success(CommonPage.restPage(tcRgtRoleService.selectTcrgtRoleList()));
        } catch (Exception e) {
          return  CommonResult.failed("角色列表获取失败");
        }
    }

    @PostMapping("/api/lc/TCRGTROLEINSERT")
    public CommonResult insertRole(@RequestBody TcRgtRoleGroup tcRgtRoleGroup) {
        try {
            return CommonResult.success(tcRgtRoleService.insertSelective(tcRgtRoleGroup));
        } catch (Exception e) {
            return  CommonResult.failed("新增失败");
        }
    }

    @PostMapping("/api/lc/TCRGTROLEDELETE")
    public CommonResult deleteRole(@RequestBody TcRgtRoleGroup tcRgtRoleGroup) {
        try {
            return CommonResult.success(tcRgtRoleService.deleteByPrimaryKey(tcRgtRoleGroup.getRoleId()));
        } catch ( Exception E) {
            return CommonResult.failed("删除失败");
        }
    }

    @PostMapping("/api/lc/TCRGTROLEUPDATE")
    public CommonResult updateRole(@RequestBody TcRgtRoleGroup tcRgtRoleGroup) {
        try {
            return CommonResult.success(tcRgtRoleService.updateByPrimaryKeySelective(tcRgtRoleGroup));
        } catch ( Exception E) {
            return CommonResult.failed("更新失败");
        }
    }

}
