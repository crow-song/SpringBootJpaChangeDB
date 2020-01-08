package com.springboot.jpadata.infrastructure.persistence.po.master;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
public class Users {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private Integer age;
    @Column
    private boolean sex;
    @Column
    private String name;
//    public Users(String username){
//        this.username = username;
//    }
}
