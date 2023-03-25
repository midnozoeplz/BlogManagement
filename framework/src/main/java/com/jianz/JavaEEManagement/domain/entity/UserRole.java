package com.jianz.JavaEEManagement.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户和角色关联表
 * </p>
 *
 * @author jianz
 * @since 2023-02-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_user_role")

@AllArgsConstructor
public class UserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;


    private Long roleId;


}
