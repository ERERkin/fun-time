package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.Place;
import kg.erkin.FunTime.dto.entity.RoomType;
import kg.erkin.FunTime.dto.model.PlaceDto;
import kg.erkin.FunTime.dto.model.RoomTypeDto;
import kg.erkin.FunTime.service.impl.BaseCrudServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Data
public class RoomTypeMapper implements BaseMapper<RoomType, RoomTypeDto>{
    private final WithImageMapper withImageMapper;
    private final BaseCrudServiceImpl baseCrudService;

    @Override
    public RoomType dtoToEntity(RoomTypeDto dto) {
        return (RoomType) RoomType.builder()
                .id(dto.getId())
                .name(dto.getName())
                .description(dto.getDescription())
                .place((Place) baseCrudService.getById(dto.getId()))
                .album(withImageMapper.dtoToEntity(dto.getAlbum()))
                .build().id(dto.getId());
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public RoomTypeDto entityToDto(RoomType entity) {
        return RoomTypeDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .description(entity.getDescription())
                .placeId(entity.getPlace().getId())
                .album(withImageMapper.entityToDto(entity.getAlbum()))
                .build();
    }
}
