package com.jianz.JavaEEManagement.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Jianz
 * @version 1.0
 * @Description
 * @Email jianz8153.gmail.com
 * @Date 2023/2/1 16:50
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageVo {

    private List rows;

    private Long total;
}
