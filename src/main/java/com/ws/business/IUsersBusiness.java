package com.ws.business;

import com.ws.model.dto.UsersDto;
import com.ws.model.entity.UsersEntity;

import java.util.List;

public interface IUsersBusiness {

    List<UsersDto> findAll();

    UsersDto finById(Long id) throws Exception;

    UsersDto findByNameV2 (String name) throws  Exception;

    UsersDto save(UsersDto usersDto) throws Exception;

}
