package com.jianz.JavaEEManagement.controller;


import com.jianz.JavaEEManagement.annotation.SystemLog;
import com.jianz.JavaEEManagement.domain.ResponseResult;
import com.jianz.JavaEEManagement.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 友链 前端控制器
 * </p>
 *
 * @author jianz
 * @since 2023-02-01
 */
@RestController
@RequestMapping("/link")
public class LinkController {
    @Autowired
    private LinkService linkService;

    @GetMapping("/getAllLink")
    @SystemLog(businessName = "获取所有友链")
    public ResponseResult getAllLink(){
        return linkService.getAllLink();
    }

}

