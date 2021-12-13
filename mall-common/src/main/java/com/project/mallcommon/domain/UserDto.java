package com.project.mallcommon.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 登录用户信息
 * Created by macro on 2020/6/19.
 */
/**
 * 描述：自定义注解，有该注解的缓存方法会抛出异常
 *
 * @author pangde
 * @version 1.0
 * @date 2021/12/13 11:01:21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String username;
    private String password;
    private Integer status;
    private String clientId;
    private List<String> roles;

}
