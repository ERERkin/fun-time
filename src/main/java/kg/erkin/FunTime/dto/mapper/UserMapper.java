package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.User;
import kg.erkin.FunTime.dto.model.UserDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface UserMapper extends BaseMapper<User, UserDto>{
}
