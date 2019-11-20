package com.lc.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lc.common.CommonPage;
import com.lc.common.CommonResult;
import com.lc.model.entity.TestUser;
import com.lc.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);
    /**
     * 分页获取user信息
     * @param pageInfo
     * @return
     */
    @RequestMapping("/api/lc/SELECTLISTUSER")
    public CommonResult selectUser(@RequestBody PageInfo pageInfo) {
        try {
            PageHelper.startPage(pageInfo.getPageNum(), pageInfo.getPageSize());
            return CommonResult.success(CommonPage.restPage(userService.selectList()));
        } catch (Exception e){
            return CommonResult.failed();
        }
    }

    @GetMapping("/api/lc/hello")
    public String getHello() {
        return "SpringBoot";
    }

    @PostMapping("/api/lc/INSERTUSER")
    public CommonResult addUser(@RequestBody TestUser user) {
        try {
            userService.insertSelective(user);
            return CommonResult.success("新增成功！");
        } catch (Exception e) {
            return CommonResult.failed(e.toString());
        }
    }

    @PostMapping("/api/lc/DELETETUSER")
    public CommonResult deleteUser(@RequestBody TestUser user) {
        try {
            userService.deleteByPrimaryKey(user.getId());
            return CommonResult.success("删除成功！");
        } catch (Exception e) {
            return CommonResult.failed(e.toString());
        }
    }

    @PostMapping("/api/lc/UPDATEUSER")
    public CommonResult updateUser(@RequestBody TestUser user) {
        try {
            userService.updateByPrimaryKeySelective(user);
            return CommonResult.success("更新成功！");
        } catch (Exception e) {
            return CommonResult.failed(e.toString());
        }
    }
}
