package com.ws.service;

import com.ws.model.dto.UsersDto;

import java.util.List;

public interface IUsersService {

    List<UsersDto> findAll();

    UsersDto finById(Long id);

    UsersDto save(UsersDto usersDto);


}
