package com.springboot.jpadata.application.repository;

import com.springboot.jpadata.application.api.response.UserResponseDTO;

import java.util.List;

public interface UserReadModelRepository {
    /**
     * 查询用户信息
     */
    List<UserResponseDTO> queryAllForUserResponseDTO();
}
