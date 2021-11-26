package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.Role;
import kg.erkin.FunTime.dto.model.RoleDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Data
public class RoleMapper implements BaseMapper<Role, RoleDto>{
    @Override
    public Role dtoToEntity(RoleDto dto) {
        return mapper.map(dto, Role.class);
    }

    @Override
    public RoleDto entityToDto(Role entity) {
        return mapper.map(entity, RoleDto.class);
    }

    @Override
    public String getName() {
        return null;
    }
}
