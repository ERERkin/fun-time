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
    @Override
    public User dtoToEntity(UserDto dto) {
        return null;
    }

    @Override
    public UserDto entityToDto(User entity) {
        return null;
    }
}
