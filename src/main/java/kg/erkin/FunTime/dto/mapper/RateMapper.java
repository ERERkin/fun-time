package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.Rate;
import kg.erkin.FunTime.dto.model.RateDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Data
public class RateMapper implements BaseMapper<Rate, RateDto>{
    @Override
    public Rate dtoToEntity(RateDto dto) {
        return null;
    }

    @Override
    public RateDto entityToDto(Rate entity) {
        return null;
    }
}