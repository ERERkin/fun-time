package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.RoomType;
import kg.erkin.FunTime.dto.model.RoomTypeDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface RoomTypeMapper extends BaseMapper<RoomType, RoomTypeDto>{
}
