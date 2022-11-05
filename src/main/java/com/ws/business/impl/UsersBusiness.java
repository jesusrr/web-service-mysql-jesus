package com.ws.business.impl;

import com.ws.business.IUsersBusiness;
import com.ws.mapper.IUsersMapper;
import com.ws.model.dto.UsersDto;
import com.ws.proxy.IUsersProxy;
import com.ws.service.IUsersService;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@ApplicationScoped
public class UsersBusiness implements IUsersBusiness {

    @Inject
    private IUsersService usersService;

    @Inject
    @RestClient
    private IUsersProxy usersProxy;

    @Inject
    private IUsersMapper mapper;

    @Override
    public List<UsersDto> findAll() {
  //      return usersProxy.getAll()
  //              .stream().map(mapper::toProxyDto)
  //              .collect(Collectors.toList());
    return null;
    }

    @Override
    public UsersDto finById(Long id) throws Exception {
        UsersDto usersDto = usersService.finById(id);
        log.info("user data bd => " + usersDto);
        if (usersDto == null){
            UsersDto userP = mapper.toProxyDto(usersProxy.getById(id));
            log.info("user data bd => " + userP);

            if (userP!= null){
                usersService.save(userP);
                return userP;
            }
            throw new Exception("No se encontro Users con el id => " + id);
        }
        return usersDto;
    }

    @Override
    public UsersDto save(UsersDto usersDto) {
        return null;
    }

}
