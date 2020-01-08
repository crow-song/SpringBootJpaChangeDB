package com.springboot.jpadata.infrastructure.persistence.po.slave;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
public class Account {
    @Id
    private String id;
    @Column
    private String name;
    @Column
    private Integer money;
}
