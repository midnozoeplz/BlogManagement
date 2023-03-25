package com.jianz.JavaEEManagement.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Jianz
 * @version 1.0
 * @Description
 * @Email jianz8153.gmail.com
 * @Date 2023/2/1 21:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LinkVo {

    private Long id;

    private String name;

    private String logo;

    private String description;

    private String address;
}
