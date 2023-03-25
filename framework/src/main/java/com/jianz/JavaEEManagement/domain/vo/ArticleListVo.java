package com.jianz.JavaEEManagement.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Jianz
 * @version 1.0
 * @Description
 * @Email jianz8153.gmail.com
 * @Date 2023/2/1 16:45
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleListVo {

    private Long id;

    private String title;

    private String summary;

    private String categoryName;

    private String thumbnail;

    private Long viewCount;

    private Date createTime;
}
