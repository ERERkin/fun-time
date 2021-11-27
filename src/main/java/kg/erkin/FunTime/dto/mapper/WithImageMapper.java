package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.model.WithImageDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface WithImageMapper extends BaseMapper<WithImageMapper, WithImageDto>{
}
