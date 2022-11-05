package com.ws.mapper;

import com.ws.model.dto.UsersDto;
import com.ws.model.entity.UsersEntity;
import com.ws.proxy.model.UsersProxyDto;
import org.mapstruct.Mapper;



@Mapper(componentModel = "cdi")
public interface IUsersMapper {

    UsersDto toDto(UsersEntity usersEntity);

    UsersDto toProxyDto(UsersProxyDto usersProxyDto);

    UsersProxyDto toDto(UsersDto usersDto);

    UsersEntity toEntity(UsersDto usersDto);

}
