package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.RoomType;
import kg.erkin.FunTime.dto.mapper.base.AbstractMapper;
import kg.erkin.FunTime.dto.mapper.base.BaseMapper;
import kg.erkin.FunTime.dto.model.RoomTypeDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class RoomTypeMapper extends AbstractMapper<RoomType, RoomTypeDto> {
    public RoomTypeMapper(ModelMapper mapper) {
        super(mapper, RoomType.class, RoomTypeDto.class);
    }
}
