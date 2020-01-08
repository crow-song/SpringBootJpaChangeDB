package com.springboot.jpadata.application.api;

import com.springboot.jpadata.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi {

    private UserService userService;
    @Autowired
    public UserApi(UserService userService){
        this.userService = userService;
    }
    @GetMapping("v1/users")
    public void queryUsers(){
        System.out.println(userService.queryUsers());
    }

}
