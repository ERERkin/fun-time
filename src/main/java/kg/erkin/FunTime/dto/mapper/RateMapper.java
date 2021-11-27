package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.Rate;
import kg.erkin.FunTime.dto.mapper.base.AbstractMapper;
import kg.erkin.FunTime.dto.mapper.base.BaseMapper;
import kg.erkin.FunTime.dto.model.RateDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class RateMapper extends AbstractMapper<Rate, RateDto> {
    public RateMapper(ModelMapper mapper) {
        super(mapper, Rate.class, RateDto.class);
    }
}
