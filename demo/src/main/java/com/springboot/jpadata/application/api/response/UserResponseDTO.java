package com.springboot.jpadata.application.api.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User 查询返回类型
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO {
//    private Integer id;
//    private String username;
//    private String password;

    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private boolean sex;
    private String name;
}
