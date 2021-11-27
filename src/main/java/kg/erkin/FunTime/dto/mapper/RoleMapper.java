package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.Role;
import kg.erkin.FunTime.dto.model.RoleDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface RoleMapper extends BaseMapper<Role, RoleDto>{
}
