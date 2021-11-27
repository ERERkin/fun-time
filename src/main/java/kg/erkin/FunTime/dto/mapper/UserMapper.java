package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.User;
import kg.erkin.FunTime.dto.mapper.base.AbstractMapper;
import kg.erkin.FunTime.dto.mapper.base.BaseMapper;
import kg.erkin.FunTime.dto.model.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper extends AbstractMapper<User, UserDto> {
    public UserMapper(ModelMapper mapper) {
        super(mapper, User.class, UserDto.class);
    }
}
