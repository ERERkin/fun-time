package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.Rate;
import kg.erkin.FunTime.dto.model.RateDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface RateMapper extends BaseMapper<Rate, RateDto>{
}
