package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.WithImage;
import kg.erkin.FunTime.dto.model.WithImageDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface WithImageMapper extends BaseMapper<WithImage, WithImageDto>{
}
