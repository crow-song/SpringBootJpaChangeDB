package com.springboot.jpadata.infrastructure.persistence.repository.master;

import com.springboot.jpadata.application.api.response.UserResponseDTO;
import com.springboot.jpadata.infrastructure.persistence.po.master.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaUserPORepository extends JpaRepository<Users,Integer>{

    @Query(value="select new com.springboot.jpadata.application.api.response.UserResponseDTO(" +
            "u.id,u.username,u.password,u.age,u.sex,u.name)" +
            "from Users u")
    List<UserResponseDTO> queryAllUsers();
}
