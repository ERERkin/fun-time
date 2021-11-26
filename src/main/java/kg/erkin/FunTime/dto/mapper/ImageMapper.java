package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.Image;
import kg.erkin.FunTime.dto.model.ImageDto;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Data
public class ImageMapper implements BaseMapper<Image, ImageDto> {
    @Override
    public Image dtoToEntity(ImageDto dto) {
        return dto == null ? null : mapper.map(dto, Image.class);
    }

    @Override
    public ImageDto entityToDto(Image entity) {
        return entity == null ? null : mapper.map(entity, ImageDto.class);
    }

    @Override
    public String getName() {
        return "Image";
    }
}
