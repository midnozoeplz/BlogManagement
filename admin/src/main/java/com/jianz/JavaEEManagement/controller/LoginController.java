package com.jianz.JavaEEManagement.controller;

import com.jianz.JavaEEManagement.annotation.SystemLog;
import com.jianz.JavaEEManagement.domain.ResponseResult;
import com.jianz.JavaEEManagement.domain.entity.LoginUser;
import com.jianz.JavaEEManagement.domain.entity.Menu;
import com.jianz.JavaEEManagement.domain.entity.User;
import com.jianz.JavaEEManagement.domain.vo.AdminUserInfoVo;
import com.jianz.JavaEEManagement.domain.vo.RoutersVo;
import com.jianz.JavaEEManagement.domain.vo.UserInfoVo;
import com.jianz.JavaEEManagement.handler.exception.SystemException;
import com.jianz.JavaEEManagement.service.LoginService;
import com.jianz.JavaEEManagement.service.MenuService;
import com.jianz.JavaEEManagement.service.RoleService;
import com.jianz.JavaEEManagement.utils.AppHttpCodeEnum;
import com.jianz.JavaEEManagement.utils.BeanCopyUtils;
import com.jianz.JavaEEManagement.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Jianz
 * @version 1.0
 * @Description
 * @Email jianz8153.gmail.com
 * @Date 2023/2/4 21:38
 */
@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;
    @Autowired
    private MenuService menuService;

    @Autowired
    private RoleService roleService;

    @PostMapping("/user/login")
    @SystemLog(businessName = "登录用户")
    public ResponseResult login(@RequestBody User user){

        // 提示必须传用户名
        if(!StringUtils.hasText(user.getUserName())){
            throw new SystemException(AppHttpCodeEnum.REQUIRE_USERNAME);
        }
        return loginService.login(user);
    }

    @PostMapping("/user/logout")
    public ResponseResult logout(){
        return loginService.logout();
    }

    @GetMapping("/getInfo")
    public ResponseResult<AdminUserInfoVo> getInfo(){
        //获取当前登录的用户
        LoginUser loginUser = SecurityUtils.getLoginUser();
        //根据用户id查询权限信息
        List<String> perms = menuService.selectPermsByUserId(loginUser.getUser().getId());
        //根据用户id查询角色信息
        List<String> roleKeyList = roleService.selectRoleKeyByUserId(loginUser.getUser().getId());

        //获取用户信息
        User user = loginUser.getUser();
        UserInfoVo userInfoVo = BeanCopyUtils.copyBean(user, UserInfoVo.class);
        //封装数据返回

        AdminUserInfoVo adminUserInfoVo = new AdminUserInfoVo(perms,roleKeyList,userInfoVo);
        return ResponseResult.okResult(adminUserInfoVo);
    }

    @GetMapping("getRouters")
    public ResponseResult<RoutersVo> getRouters(){
        Long userId = SecurityUtils.getUserId();
        //查询menu 结果是tree的形式
        List<Menu> menus = menuService.selectRouterMenuTreeByUserId(userId);
        //封装数据返回
        return ResponseResult.okResult(new RoutersVo(menus));
    }



//    @PostMapping("/logout")
//    @SystemLog(businessName = "注销用户")
//    public ResponseResult logout(){
//        return blogLoginService.logout();
//    }
}