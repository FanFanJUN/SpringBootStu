package com.lc.controller;


import com.lc.model.entity.TestUser;
import com.lc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping("/api/lc/getAllUsers")
    public TestUser selectUser() {
       TestUser testUser =new TestUser();
       testUser.setId(1);
        return userService.getUser(testUser);
    }

    @GetMapping("/api/lc/hello")
    public String getHello() {
        return "SpringBoot";
    }
}
