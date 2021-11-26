package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.User;
import kg.erkin.FunTime.dto.model.UserDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Data
public class UserMapper implements BaseMapper<User, UserDto>{
    private final RoleMapper roleMapper;
    private final WithImageMapper withImageMapper;

    @Override
    public User dtoToEntity(UserDto dto) {
        return User.builder()
                .id(dto.getId())
                .login(dto.getLogin())
                .password(dto.getPassword())
                .email(dto.getEmail())
                .role(roleMapper.dtoToEntity(dto.getRole()))
                .avatar(withImageMapper.dtoToEntity(dto.getAvatar()))
                .build();
    }

    @Override
    public UserDto entityToDto(User entity) {
        return UserDto.builder()
                .id(entity.getId())
                .login(entity.getLogin())
                .password(entity.getPassword())
                .email(entity.getEmail())
                .role(roleMapper.entityToDto(entity.getRole()))
                .avatar(withImageMapper.entityToDto(entity.getAvatar()))
                .build();
    }

    @Override
    public String getName() {
        return null;
    }
}
