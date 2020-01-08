package com.springboot.jpadata.infrastructure.persistence.repository.slave;

import com.springboot.jpadata.application.api.response.AccountResponseDTO;
import com.springboot.jpadata.infrastructure.persistence.po.slave.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 没有 extends JpaRepository<>，则 from 中的实体类无效
 * Field jpaAccountPORepository in
 * com.springboot.jpadata.infrastructure.persistence.repository.slave.AccountRepositoryImpl
 * required a bean of type
 * 'com.springboot.jpadata.infrastructure.persistence.repository.slave.JpaAccountPORepository'
 * that could not be found.
 */
@Repository
public interface JpaAccountPORepository extends JpaRepository<Account,String>{

    @Query(value="select new com.springboot.jpadata.application.api.response.AccountResponseDTO(" +
            "a.id,a.name,a.money) " +
            "from Account a")
    List<AccountResponseDTO> queryAllAccounts();
}
