package com.ws.business;

import com.ws.model.dto.UsersDto;

import java.util.List;

public interface IUsersBusiness {

    List<UsersDto> findAll();

    UsersDto finById(Long id) throws Exception;

    UsersDto save(UsersDto usersDto);

 //   UsersDto update(UsersDto usersDto, Long id);
}
