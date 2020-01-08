package com.springboot.jpadata.application.service;

import com.springboot.jpadata.application.api.response.UserResponseDTO;
import com.springboot.jpadata.application.repository.UserReadModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserReadModelRepository userReadModelRepository;
    @Autowired
    public UserService(UserReadModelRepository userReadModelRepository){
        this.userReadModelRepository = userReadModelRepository;
    }
    public List<UserResponseDTO> queryUsers(){
        return userReadModelRepository.queryAllForUserResponseDTO();
    }
}
