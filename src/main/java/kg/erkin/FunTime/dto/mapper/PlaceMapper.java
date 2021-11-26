package kg.erkin.FunTime.dto.mapper;


import kg.erkin.FunTime.dto.entity.Place;
import kg.erkin.FunTime.dto.model.PlaceDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@AllArgsConstructor
@Data
public class PlaceMapper implements BaseMapper<Place, PlaceDto> {
    private final WithImageMapper withImageMapper;
    private final RoomTypeMapper roomTypeMapper;

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Place dtoToEntity(PlaceDto dto) {
        return (Place) Place.builder()
                .id(dto.getId())
                .name(dto.getName())
                .description(dto.getDescription())
                .address(dto.getAddress())
                .album(withImageMapper.dtoToEntity(dto.getAlbum()))
                .build().id(dto.getId());
    }

    @Override
    public PlaceDto entityToDto(Place entity) {
        return PlaceDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .description(entity.getDescription())
                .address(entity.getAddress())
                .album(withImageMapper.entityToDto(entity.getAlbum()))
                .roomTypes(entity.getRoomTypes().stream().map(roomTypeMapper::entityToDto).collect(Collectors.toList()))
                .build();
    }
}
