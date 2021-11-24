package kg.erkin.FunTime.dto.mapper;


import kg.erkin.FunTime.dto.entity.Place;
import kg.erkin.FunTime.dto.model.PlaceDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Data
public class PlaceMapper implements BaseMapper<Place, PlaceDto> {
    @Override
    public Place dtoToEntity(PlaceDto dto) {
        return null;
    }

    @Override
    public PlaceDto entityToDto(Place entity) {
        return null;
    }
}
