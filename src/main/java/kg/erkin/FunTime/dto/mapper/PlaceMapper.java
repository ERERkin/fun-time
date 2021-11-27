package kg.erkin.FunTime.dto.mapper;


import kg.erkin.FunTime.dto.entity.Place;
import kg.erkin.FunTime.dto.model.PlaceDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface PlaceMapper extends BaseMapper<Place, PlaceDto> {
}
