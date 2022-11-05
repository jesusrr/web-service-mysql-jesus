package com.ws.repository;

import com.ws.model.entity.UsersEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UsersRepository implements PanacheRepositoryBase<UsersEntity, Long> {

}
