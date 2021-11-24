package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.Image;
import kg.erkin.FunTime.dto.entity.WithImage;
import kg.erkin.FunTime.dto.model.ImageDto;
import kg.erkin.FunTime.dto.model.WithImageDto;
import kg.erkin.FunTime.service.BaseCrudService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
@Data
public class WithImageMapper{
    private final BaseCrudService baseCrudService;
    private final ImageMapper imageMapper;

    // TODO Надо сделать обратку
    public WithImage dtoToEntity(List<ImageDto> imageDtos) {
        return null;
    }

    public List<ImageDto> entityToDto(WithImage entity) {
        return entity.getImages().stream().map(imageMapper::entityToDto).collect(Collectors.toList());
    }
}
