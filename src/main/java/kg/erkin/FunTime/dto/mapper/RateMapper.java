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

    @Override
    public RateDto toDto(Rate entity) {
        if (entity == null) return null;
        if (entity.getRoomType() != null && entity.getRoomType().getPlace() != null){
            entity.getRoomType().getPlace().setAlbum(null);
            entity.getRoomType().getPlace().setRoomTypes(null);
        }
        return super.toDto(entity);
    }
}
