package kg.erkin.FunTime.dto.mapper;


import kg.erkin.FunTime.dto.entity.Place;
import kg.erkin.FunTime.dto.mapper.base.AbstractMapper;
import kg.erkin.FunTime.dto.mapper.base.BaseMapper;
import kg.erkin.FunTime.dto.model.PlaceDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PlaceMapper extends AbstractMapper<Place, PlaceDto> {
    public PlaceMapper(ModelMapper mapper) {
        super(mapper, Place.class, PlaceDto.class);
    }
}
