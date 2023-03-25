package com.jianz.JavaEEManagement.domain.vo;

import lombok.Data;
import lombok.experimental.Accessors;

 /**
  * @author Jianz
  * @Description
  * @Return
  * @Date 2023/2/1 23:23
  */
@Data
@Accessors(chain = true)
public class UserInfoVo {
    /**
     * 主键
     */
    private Long id;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 头像
     */
    private String avatar;

    private String sex;

    private String email;


}
