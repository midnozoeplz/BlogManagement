package com.jianz.JavaEEManagement.controller;

import com.jianz.JavaEEManagement.annotation.SystemLog;
import com.jianz.JavaEEManagement.domain.ResponseResult;
import com.jianz.JavaEEManagement.domain.entity.User;
import com.jianz.JavaEEManagement.service.BlogLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Jianz
 * @version 1.0
 * @Description
 * @Email jianz8153.gmail.com
 * @Date 2023/2/3 21:55
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private BlogLoginService userService;

    @GetMapping("/userInfo")
    @SystemLog(businessName = "获取用户信息")
    public ResponseResult userInfo(){
        return userService.userInfo();
    }

    @PutMapping("/userInfo")
    @SystemLog(businessName = "更新用户信息")
    public ResponseResult updateUserInfo(@RequestBody User user){
        return userService.updateUserInfo(user);
    }

    @PostMapping("/register")
    @SystemLog(businessName = "注册用户")
    public ResponseResult register(@RequestBody User user){
        return userService.register(user);
    }
}
