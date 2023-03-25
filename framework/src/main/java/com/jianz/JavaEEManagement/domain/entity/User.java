package com.jianz.JavaEEManagement.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author jianz
 * @since 2023-02-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_user")

public class User implements Serializable {

    private static final long serialVersionUID = 1L;


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    private String userName;


    private String nickName;


    private String password;


    private String type;

    private String status;


    private String email;


    private String phonenumber;

    private String sex;

    private String avatar;


    private Long createBy;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    private Long updateBy;


    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    private Integer delFlag;

    //关联角色id数组，非user表字段
    @TableField(exist = false)
    private Long[] roleIds;



}
