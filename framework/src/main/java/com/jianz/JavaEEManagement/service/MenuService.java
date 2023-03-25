package com.jianz.JavaEEManagement.service;

import com.jianz.JavaEEManagement.domain.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 菜单权限表 服务类
 * </p>
 *
 * @author jianz
 * @since 2023-02-04
 */
public interface MenuService extends IService<Menu> {

    List<String> selectPermsByUserId(Long id);

    List<Menu> selectRouterMenuTreeByUserId(Long userId);

    List<Menu> selectMenuList(Menu menu);

    List<Long> selectMenuListByRoleId(Long roleId);

    boolean hasChild(Long menuId);

}
