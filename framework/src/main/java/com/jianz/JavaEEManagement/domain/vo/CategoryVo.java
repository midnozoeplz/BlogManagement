package com.jianz.JavaEEManagement.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Jianz
 * @version 1.0
 * @Description
 * @Email jianz8153.gmail.com
 * @Date 2023/2/1 16:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryVo {

    private Long id;

    private String name;

    //描述
    private String description;
}
