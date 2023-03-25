package com.jianz.JavaEEManagement.mapper;

import com.jianz.JavaEEManagement.domain.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author jianz
 * @since 2023-02-01
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
