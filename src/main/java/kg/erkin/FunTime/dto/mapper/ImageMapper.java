package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.Image;
import kg.erkin.FunTime.dto.model.ImageDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ImageMapper extends BaseMapper<Image, ImageDto> {
}
