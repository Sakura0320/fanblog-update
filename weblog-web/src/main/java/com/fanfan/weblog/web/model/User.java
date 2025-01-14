package com.fanfan.weblog.web.model;

import lombok.Data;
import javax.validation.constraints.*;

/**
 *Author: fanfan
 *Date: 2025/1/15
 *Description:测试参数校验,NotBlank表示字符串不为空，相对应Notnull
 */

@Data
public class User {
    //用户名
    @NotBlank(message = "用户名不能为空")//注解确保用户名不为空
    private String username;
    //性别
    @NotNull(message = "性别不能为空")
    private Integer sex;

    //年龄
    @NotNull(message = "年龄不能为空")
    @Min(value = 18, message = "年龄必须大于或等于18岁")
    @Max(value = 100, message = "年龄必须小于或等于18岁")
    private Integer age;

    //邮箱
    @NotBlank(message = "邮箱不能为空")
    @Email(message = "邮箱格式不正确")
    private String email;
}
