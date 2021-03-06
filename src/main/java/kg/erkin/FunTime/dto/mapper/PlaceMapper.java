package kg.erkin.FunTime.dto.mapper;


import kg.erkin.FunTime.dto.entity.Place;
import kg.erkin.FunTime.dto.mapper.base.AbstractMapper;
import kg.erkin.FunTime.dto.mapper.base.BaseMapper;
import kg.erkin.FunTime.dto.model.PlaceDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class PlaceMapper extends AbstractMapper<Place, PlaceDto> {
    public PlaceMapper(ModelMapper mapper) {
        super(mapper, Place.class, PlaceDto.class);
    }

    @Override
    public PlaceDto toDto(Place entity) {
        if (entity == null) return null;
        if (entity.getAlbum() != null && entity.getAlbum().getImages() != null)
            entity.getAlbum().getImages().stream().peek(x -> x.setAlbum(null)).collect(Collectors.toList());
        if (entity.getRoomTypes() != null)
            entity.getRoomTypes().stream().peek(x -> {
                x.setPlace(null);
                x.setAlbum(null);
            }).collect(Collectors.toList());
        return super.toDto(entity);
    }
}
