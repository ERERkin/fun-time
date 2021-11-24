package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.Role;
import kg.erkin.FunTime.dto.model.RoleDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Data
public class RoleMapper implements BaseMapper<Role, RoleDto>{
    @Override
    public Role dtoToEntity(RoleDto dto) {
        return null;
    }

    @Override
    public RoleDto entityToDto(Role entity) {
        return null;
    }
}
