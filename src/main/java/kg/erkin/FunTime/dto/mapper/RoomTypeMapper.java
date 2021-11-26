package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.Place;
import kg.erkin.FunTime.dto.entity.RoomType;
import kg.erkin.FunTime.dto.model.PlaceDto;
import kg.erkin.FunTime.dto.model.RoomTypeDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Data
public class RoomTypeMapper implements BaseMapper<RoomType, RoomTypeDto>{
    private final PlaceMapper placeMapper;
    private final WithImageMapper withImageMapper;

    @Override
    public RoomType dtoToEntity(RoomTypeDto dto) {
        return (RoomType) RoomType.builder()
                .id(dto.getId())
                .name(dto.getName())
                .description(dto.getDescription())
                .place(placeMapper.dtoToEntity(dto.getPlace()))
                .album(withImageMapper.dtoToEntity(dto.getAlbum()))
                .build().id(dto.getId());
    }

    @Override
    public RoomTypeDto entityToDto(RoomType entity) {
        return RoomTypeDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .description(entity.getDescription())
                .place(placeMapper.entityToDto(entity.getPlace()))
                .album(withImageMapper.entityToDto(entity.getAlbum()))
                .build();
    }
}
