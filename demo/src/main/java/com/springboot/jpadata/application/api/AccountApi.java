package com.springboot.jpadata.application.api;

import com.springboot.jpadata.application.api.response.AccountResponseDTO;
import com.springboot.jpadata.application.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountApi {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/v1/account")
    public List<AccountResponseDTO> queryAccounts(){
        return accountService.queryAccounts();
    }
}
