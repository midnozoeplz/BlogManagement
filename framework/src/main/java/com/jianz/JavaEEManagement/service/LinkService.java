package com.jianz.JavaEEManagement.service;

import com.jianz.JavaEEManagement.domain.ResponseResult;
import com.jianz.JavaEEManagement.domain.entity.Link;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 友链 服务类
 * </p>
 *
 * @author jianz
 * @since 2023-02-01
 */
public interface LinkService extends IService<Link> {

    ResponseResult getAllLink();
}
