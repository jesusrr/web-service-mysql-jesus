package com.ws.model.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Data;

import javax.persistence.*;

@Entity(name = "users")
@Data
public class UsersEntity extends PanacheEntity {
    private String name;
    private String email;
    private String gender;
    private String status;
}
