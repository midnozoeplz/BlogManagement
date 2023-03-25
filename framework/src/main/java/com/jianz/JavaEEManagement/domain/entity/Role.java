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
 * 角色信息表
 * </p>
 *
 * @author jianz
 * @since 2023-02-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_role")

public class Role implements Serializable {

    private static final long serialVersionUID = 1L;


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    private String roleName;

    private String roleKey;


    private Integer roleSort;


    private String status;


    private String delFlag;


    private Long createBy;


    @TableField(fill = FieldFill.INSERT)
    private Date createTime;


    private Long updateBy;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;


    private String remark;


}
