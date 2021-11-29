package kg.erkin.FunTime.service.impl;

import kg.erkin.FunTime.dto.entity.User;
import kg.erkin.FunTime.dto.entity.WithImage;
import kg.erkin.FunTime.dto.mapper.UserMapper;
import kg.erkin.FunTime.dto.model.UserDto;
import kg.erkin.FunTime.dto.model.WithImageDto;
import kg.erkin.FunTime.repository.UserRepository;
import kg.erkin.FunTime.service.UserService;
import kg.erkin.FunTime.service.WithImageService;
import kg.erkin.FunTime.service.base.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends AbstractService<User, UserDto, UserRepository, UserMapper> implements UserService {
    private final WithImageService withImageService;

    public UserServiceImpl(UserRepository repository, UserMapper mapper, WithImageService withImageService) {
        super(repository, mapper);
        this.withImageService = withImageService;
    }

    @Override
    public UserDto save(UserDto item) {
        if(item.getId() == null){
            WithImageDto avatar = withImageService.saveWithImage(WithImage.builder().build());
            item.setAvatar(avatar);
        }
        return super.save(item);
    }
}
