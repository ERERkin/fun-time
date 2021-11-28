package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.RoomType;
import kg.erkin.FunTime.dto.mapper.base.AbstractMapper;
import kg.erkin.FunTime.dto.mapper.base.BaseMapper;
import kg.erkin.FunTime.dto.model.RoomTypeDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class RoomTypeMapper extends AbstractMapper<RoomType, RoomTypeDto> {
    public RoomTypeMapper(ModelMapper mapper) {
        super(mapper, RoomType.class, RoomTypeDto.class);
    }

    @Override
    public RoomTypeDto toDto(RoomType entity) {
        if (entity == null) return null;
        if (entity.getPlace() != null) {
            entity.getPlace().setAlbum(null);
            entity.getPlace().setRoomTypes(null);
        }
        if (entity.getAlbum() != null && entity.getAlbum().getImages() != null)
            entity.getAlbum().getImages().stream().peek(x -> x.setAlbum(null)).collect(Collectors.toList());
        return super.toDto(entity);
    }
}
