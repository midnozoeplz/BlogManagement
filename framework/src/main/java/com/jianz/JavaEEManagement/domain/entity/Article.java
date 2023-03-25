package com.jianz.JavaEEManagement.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * 文章表
 * </p>
 *
 * @author jianz
 * @since 2023-01-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sg_article")
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    public Article(Long id, long viewCount) {
        this.id = id;
        this.viewCount = viewCount;
    }

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String title;


    private String content;


    private String summary;


    private Long categoryId;

    @TableField(exist = false) // 表示新添字段，表中没有
    private String categoryName;


    private String thumbnail;


    private String isTop;


    private String status;

    private Long viewCount;


    private String isComment;

    @TableField(fill = FieldFill.INSERT)
    private Long createBy;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateBy;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    private Integer delFlag;


}
