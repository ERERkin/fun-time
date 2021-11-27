package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.Role;
import kg.erkin.FunTime.dto.mapper.base.AbstractMapper;
import kg.erkin.FunTime.dto.mapper.base.BaseMapper;
import kg.erkin.FunTime.dto.model.RoleDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper extends AbstractMapper<Role, RoleDto> {
    public RoleMapper(ModelMapper mapper) {
        super(mapper, Role.class, RoleDto.class);
    }
}
