package com.jianz.JavaEEManagement.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.List;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 菜单权限表
 * </p>
 *
 * @author jianz
 * @since 2023-02-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_menu")

@Accessors(chain = true)
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    private String menuName;


    private Long parentId;


    private Integer orderNum;


    private String path;


    private String component;

    private Integer isFrame;


    private String menuType;

    private String visible;


    private String status;

    private String perms;


    private String icon;

    private Long createBy;


    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    private Long updateBy;


    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;


    private String remark;

    private String delFlag;

    @TableField(exist = false)
    private List<Menu> children;

}
