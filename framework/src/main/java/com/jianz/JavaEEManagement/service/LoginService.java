package com.jianz.JavaEEManagement.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jianz.JavaEEManagement.domain.ResponseResult;
import com.jianz.JavaEEManagement.domain.entity.User;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author jianz
 * @since 2023-02-01
 */
public interface LoginService{

    ResponseResult login(User user);

    ResponseResult logout();
}


