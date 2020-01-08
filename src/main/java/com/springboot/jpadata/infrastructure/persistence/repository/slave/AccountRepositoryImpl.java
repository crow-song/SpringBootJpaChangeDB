package com.springboot.jpadata.infrastructure.persistence.repository.slave;

import com.springboot.jpadata.application.api.response.AccountResponseDTO;
import com.springboot.jpadata.application.repository.AccountReadModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class AccountRepositoryImpl implements AccountReadModelRepository {
    @Autowired
    private JpaAccountPORepository jpaAccountPORepository;
    @Override
    public List<AccountResponseDTO> queryAllForUserResponseDTO() {
        return jpaAccountPORepository.queryAllAccounts();
    }
}
