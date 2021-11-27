package kg.erkin.FunTime.service.impl;

import kg.erkin.FunTime.dto.entity.Role;
import kg.erkin.FunTime.dto.mapper.RoleMapper;
import kg.erkin.FunTime.dto.model.RoleDto;
import kg.erkin.FunTime.repository.RoleRepository;
import kg.erkin.FunTime.service.RoleService;
import kg.erkin.FunTime.service.base.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends AbstractService<Role, RoleDto, RoleRepository, RoleMapper> implements RoleService {
    public RoleServiceImpl(RoleRepository repository, RoleMapper mapper) {
        super(repository, mapper);
    }
}
