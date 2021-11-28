package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.WithImage;
import kg.erkin.FunTime.dto.mapper.base.AbstractMapper;
import kg.erkin.FunTime.dto.model.ImageDto;
import kg.erkin.FunTime.dto.model.WithImageDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class WithImageMapper extends AbstractMapper<WithImage, WithImageDto> {
    private final ImageMapper imageMapper;

    public WithImageMapper(ModelMapper mapper, ImageMapper imageMapper) {
        super(mapper, WithImage.class, WithImageDto.class);
        this.imageMapper = imageMapper;
    }

    @Override
    public WithImageDto toDto(WithImage entity) {
        if(entity == null) return null;
        entity.getImages().stream().map(x -> {
            x.setAlbum(null);
            return x;
        }).collect(Collectors.toList());
        return super.toDto(entity);
    }
}
