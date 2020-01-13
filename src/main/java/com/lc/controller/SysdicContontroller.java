package com.lc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lc.cache.BaseCache;
import com.lc.common.CommonPage;
import com.lc.common.CommonResult;
import com.lc.model.entity.SysDic;
import com.lc.service.SysDicService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SysdicContontroller {

    @Resource
    SysDicService sysDicService;
    @Resource
    BaseCache baseCache;

    @PostMapping("/api/lc/SYSDICINSERT")
    public CommonResult insert(@RequestBody SysDic sysDic) {
        try {
            sysDicService.insertSelective(sysDic);
            baseCache.refreshCache();
            return CommonResult.success();
        } catch (Exception E) {
            return  CommonResult.failed(E.toString());
        }
    }

    @PostMapping("/api/lc/SYSDICDELETE")
    public CommonResult delete(@RequestBody SysDic sysDic) {
        try {
            sysDicService.deleteByPrimaryKey(sysDic.getDictionaryNo(), sysDic.getDictionaryCategoryNo());
            baseCache.refreshCache();
            return CommonResult.success();
        } catch (Exception E) {
            return  CommonResult.failed(E.toString());
        }
    }
    @PostMapping("/api/lc/SYSDICSELECTLIST")
    public CommonResult selectList(@RequestBody PageInfo pageInfo) {
        try {
            PageHelper.startPage(pageInfo.getPageNum(), pageInfo.getPageSize());
            return CommonResult.success(CommonPage.restPage(sysDicService.selectList()));
        } catch (Exception E) {
            return  CommonResult.failed(E.toString());
        }
    }
    @PostMapping("/api/lc/SYSDICUPDATE")
    public CommonResult update(@RequestBody SysDic sysDic) {
        try {
            sysDicService.updateByPrimaryKeySelective(sysDic);
            baseCache.refreshCache();
            return CommonResult.success();
        } catch (Exception E) {
            return  CommonResult.failed(E.toString());
        }
    }

}
