package com.springboot.jpadata.infrastructure.persistence.repository.master;

import com.springboot.jpadata.application.api.response.UserResponseDTO;
import com.springboot.jpadata.application.repository.UserReadModelRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Slf4j
public class UserRepositoryImpl implements UserReadModelRepository {
    @Autowired
    private JpaUserPORepository jpaUserPoRepository;


    @Override
    public List<UserResponseDTO> queryAllForUserResponseDTO() {
        return jpaUserPoRepository.queryAllUsers();
    }

}
