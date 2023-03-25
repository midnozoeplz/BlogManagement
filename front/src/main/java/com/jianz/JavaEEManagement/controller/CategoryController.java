package com.jianz.JavaEEManagement.controller;


import com.jianz.JavaEEManagement.annotation.SystemLog;
import com.jianz.JavaEEManagement.domain.ResponseResult;
import com.jianz.JavaEEManagement.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 分类表 前端控制器
 * </p>
 *
 * @author jianz
 * @since 2023-02-01
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/getCategoryList")
    @SystemLog(businessName = "获取分类列表")
    public ResponseResult getCategoryList(){
        return categoryService.getCategoryList();
    }
}

