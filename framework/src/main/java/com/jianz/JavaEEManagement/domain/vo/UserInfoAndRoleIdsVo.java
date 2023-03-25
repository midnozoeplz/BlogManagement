package com.jianz.JavaEEManagement.domain.vo;

import com.jianz.JavaEEManagement.domain.entity.Role;
import com.jianz.JavaEEManagement.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoAndRoleIdsVo {
    private User user;
    private List<Role> roles;
    private List<Long> roleIds;



}
