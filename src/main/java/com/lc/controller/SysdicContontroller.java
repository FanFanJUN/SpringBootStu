package com.lc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lc.cache.BaseCache;
import com.lc.common.CommonPage;
import com.lc.common.CommonResult;
import com.lc.model.entity.SysDic;
import com.lc.model.entity.SysDicCategory;
import com.lc.service.SysDicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "SysdicContontroller", tags = "数据字典控制器")
public class SysdicContontroller {

    @Resource
    SysDicService sysDicService;
    @Resource
    BaseCache baseCache;

    @PostMapping("/api/lc/SYSDICINSERT")
    @ApiOperation(value = "数据字典新增" , notes = "数据字典新增")
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
    @ApiOperation(value = "删除数据字典" , notes = "删除数据字典")
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
    @ApiOperation(value = "数据字典列表查询" , notes = "数据字典列表查询")
    public CommonResult selectList(@RequestBody SysDic sysDic) {
        try {
            PageHelper.startPage(sysDic.getPageNum(), sysDic.getPageSize());
            return CommonResult.success(CommonPage.restPage(sysDicService.selectList(sysDic)));
        } catch (Exception E) {
            return  CommonResult.failed(E.toString());
        }
    }
    @PostMapping("/api/lc/SYSDICUPDATE")
    @ApiOperation(value = "更新数据字典" , notes = "更新数据字典")
    public CommonResult update(@RequestBody SysDic sysDic) {
        try {
            sysDicService.updateByPrimaryKeySelective(sysDic);
            baseCache.refreshCache();
            return CommonResult.success();
        } catch (Exception E) {
            return  CommonResult.failed(E.toString());
        }
    }

    @PostMapping("/api/lc/SYSDICSELECTCATEGORY")
    @ApiOperation(value = "查询数据字典类别" , notes = "查询数据字典类别")
    public CommonResult selectCategory(@RequestBody SysDicCategory sysDicCategory) {
        try {
            PageHelper.startPage(sysDicCategory.getPageNum(), sysDicCategory.getPageSize());
            return CommonResult.success(CommonPage.restPage(sysDicService.selectCategory(sysDicCategory)));
        } catch (Exception E) {
            return  CommonResult.failed(E.toString());
        }
    }

    @PostMapping("/api/lc/INSERTDICCATEGORY")
    @ApiOperation(value = "新增数据字典类别" , notes = "新增数据字典类别")
    public CommonResult insertCategory(@RequestBody SysDicCategory sysDicCategory) {
        try {
            sysDicService.insertCategorySelective(sysDicCategory);
            return CommonResult.success();
        } catch (Exception E) {
            return  CommonResult.failed(E.toString());
        }
    }
}
