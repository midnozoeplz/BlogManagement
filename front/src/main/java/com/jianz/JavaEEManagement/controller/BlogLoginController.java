package com.jianz.JavaEEManagement.controller;

import com.jianz.JavaEEManagement.annotation.SystemLog;
import com.jianz.JavaEEManagement.domain.ResponseResult;
import com.jianz.JavaEEManagement.domain.entity.User;
import com.jianz.JavaEEManagement.handler.exception.SystemException;
import com.jianz.JavaEEManagement.service.BlogLoginService;
import com.jianz.JavaEEManagement.utils.AppHttpCodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogLoginController {
    @Autowired
    private BlogLoginService blogLoginService;

    @PostMapping("/login")
    @SystemLog(businessName = "登录用户")
    public ResponseResult login(@RequestBody User user){

        // 提示必须传用户名
        if(!StringUtils.hasText(user.getUserName())){
            throw new SystemException(AppHttpCodeEnum.REQUIRE_USERNAME);
        }
        return blogLoginService.login(user);
    }

    @PostMapping("/logout")
    @SystemLog(businessName = "注销用户")
    public ResponseResult logout(){
        return blogLoginService.logout();
    }
}