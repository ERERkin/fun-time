package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.WithImage;
import kg.erkin.FunTime.dto.mapper.base.AbstractMapper;
import kg.erkin.FunTime.dto.mapper.base.BaseMapper;
import kg.erkin.FunTime.dto.model.WithImageDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class WithImageMapper extends AbstractMapper<WithImage, WithImageDto> {
    public WithImageMapper(ModelMapper mapper) {
        super(mapper, WithImage.class, WithImageDto.class);
    }
}
