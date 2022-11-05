package com.ws.service.impl;

import com.ws.mapper.IUsersMapper;
import com.ws.model.dto.UsersDto;
import com.ws.repository.UsersRepository;
import com.ws.service.IUsersService;
import lombok.RequiredArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
@RequiredArgsConstructor
public class UsersService implements IUsersService {

    private final UsersRepository repository;
    private final IUsersMapper mapper;

    @Override
    public List<UsersDto> findAll() {

        return repository.listAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public UsersDto finById(Long id) {
        return mapper.toDto(repository.findById(id));
    }


    @Override
    @Transactional
    public UsersDto save(UsersDto usersDto) {
        repository.persist(mapper.toEntity(usersDto));
        return usersDto;
    }

    @Override
    public UsersDto update(UsersDto usersDto, Long id) {
        return null;
    }

}
