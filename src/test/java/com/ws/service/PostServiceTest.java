package com.ws.service;

import com.ws.mapper.IUsersMapper;
import com.ws.model.dto.UsersDto;
import com.ws.model.entity.UsersEntity;
import com.ws.repository.UsersRepository;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;


@QuarkusTest
public class PostServiceTest {

    @Inject
    private IUsersService usersService;
    @InjectMock
    private UsersRepository repository;
    @InjectMock
    private IUsersMapper mapper;

    @Test
    public void findAllTest(){
        Mockito.when(repository.listAll())
                .thenReturn(Arrays.asList(UsersEntity.builder().name("este es un nombre").status("esto es un test de users").build()));
        Mockito.when(mapper.toDto(UsersEntity.builder().name("este es un nombre").status("esto es un test de users").build()))
                .thenReturn(UsersDto.builder().name("esto es un nombre").status("esteo es un test de users").build());

        List<UsersDto> responseTest = usersService.findAll();
        Assertions.assertEquals(1, responseTest.size());
    }
}
