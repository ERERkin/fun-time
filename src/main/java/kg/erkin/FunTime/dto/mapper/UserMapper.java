package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.User;
import kg.erkin.FunTime.dto.mapper.base.AbstractMapper;
import kg.erkin.FunTime.dto.mapper.base.BaseMapper;
import kg.erkin.FunTime.dto.model.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class UserMapper extends AbstractMapper<User, UserDto> {
    public UserMapper(ModelMapper mapper) {
        super(mapper, User.class, UserDto.class);
    }

    @Override
    public UserDto toDto(User entity) {
        if (entity == null) return null;
        if (entity.getAvatar() != null && entity.getAvatar().getImages() != null)
            entity.getAvatar().getImages().stream().peek(x -> x.setAlbum(null)).collect(Collectors.toList());
        return super.toDto(entity);
    }
}
