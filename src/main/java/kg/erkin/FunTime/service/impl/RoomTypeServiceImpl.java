package kg.erkin.FunTime.service.impl;

import kg.erkin.FunTime.dto.entity.RoomType;
import kg.erkin.FunTime.dto.mapper.RoomTypeMapper;
import kg.erkin.FunTime.dto.model.RoomTypeDto;
import kg.erkin.FunTime.repository.RoomTypeRepository;
import kg.erkin.FunTime.service.RoomTypeService;
import kg.erkin.FunTime.service.base.AbstractService;

public class RoomTypeServiceImpl extends AbstractService<RoomType, RoomTypeDto, RoomTypeRepository, RoomTypeMapper> implements RoomTypeService {
    public RoomTypeServiceImpl(RoomTypeRepository repository, RoomTypeMapper mapper) {
        super(repository, mapper);
    }
}
