package com.springboot.jpadata.application.service;

import com.springboot.jpadata.application.api.response.AccountResponseDTO;
import com.springboot.jpadata.application.repository.AccountReadModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    private AccountReadModelRepository accountReadModelRepository;
    @Autowired
    public AccountService(AccountReadModelRepository accountReadModelRepository){
        this.accountReadModelRepository = accountReadModelRepository;
    }
    public List<AccountResponseDTO> queryAccounts(){
        return accountReadModelRepository.queryAllForUserResponseDTO();
    }

}
