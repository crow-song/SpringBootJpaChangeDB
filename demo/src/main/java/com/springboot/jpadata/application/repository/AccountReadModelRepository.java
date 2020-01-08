package com.springboot.jpadata.application.repository;

import com.springboot.jpadata.application.api.response.AccountResponseDTO;

import java.util.List;

public interface AccountReadModelRepository {
    /**
     * 查询 acount 信息
     */
    List<AccountResponseDTO> queryAllForUserResponseDTO();
}
