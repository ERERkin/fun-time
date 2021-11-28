package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.Image;
import kg.erkin.FunTime.dto.mapper.base.AbstractMapper;
import kg.erkin.FunTime.dto.mapper.base.BaseMapper;
import kg.erkin.FunTime.dto.model.ImageDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ImageMapper extends AbstractMapper<Image, ImageDto> {
    public ImageMapper(ModelMapper mapper) {
        super(mapper, Image.class, ImageDto.class);
    }

    @Override
    public ImageDto toDto(Image entity) {
        if (entity == null) return null;
        entity.setAlbum(null);
        return mapper.map(entity, ImageDto.class);
    }
}
