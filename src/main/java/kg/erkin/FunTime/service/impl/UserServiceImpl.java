package kg.erkin.FunTime.service.impl;

import kg.erkin.FunTime.dto.entity.User;
import kg.erkin.FunTime.dto.mapper.UserMapper;
import kg.erkin.FunTime.dto.model.UserDto;
import kg.erkin.FunTime.repository.UserRepository;
import kg.erkin.FunTime.service.UserService;
import kg.erkin.FunTime.service.base.AbstractService;

public class UserServiceImpl extends AbstractService<User, UserDto, UserRepository, UserMapper> implements UserService {
    public UserServiceImpl(UserRepository repository, UserMapper mapper) {
        super(repository, mapper);
    }
}
