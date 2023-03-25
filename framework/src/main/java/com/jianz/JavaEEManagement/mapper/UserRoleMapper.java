package com.jianz.JavaEEManagement.mapper;

import com.jianz.JavaEEManagement.domain.entity.UserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户和角色关联表 Mapper 接口
 * </p>
 *
 * @author jianz
 * @since 2023-02-07
 */
@Mapper
public interface UserRoleMapper extends BaseMapper<UserRole> {

}
