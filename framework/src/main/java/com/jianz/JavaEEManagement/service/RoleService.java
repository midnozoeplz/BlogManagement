package com.jianz.JavaEEManagement.service;

import com.jianz.JavaEEManagement.domain.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 角色信息表 服务类
 * </p>
 *
 * @author jianz
 * @since 2023-02-04
 */
public interface RoleService extends IService<Role> {

    List<String> selectRoleKeyByUserId(Long id);

    List<Role> selectRoleAll();

    List<Long> selectRoleIdByUserId(Long userId);

}
