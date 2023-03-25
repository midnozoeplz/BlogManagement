package com.jianz.JavaEEManagement.service.impl;

import com.jianz.JavaEEManagement.domain.entity.UserRole;
import com.jianz.JavaEEManagement.mapper.UserRoleMapper;
import com.jianz.JavaEEManagement.service.UserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户和角色关联表 服务实现类
 * </p>
 *
 * @author jianz
 * @since 2023-02-07
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}
