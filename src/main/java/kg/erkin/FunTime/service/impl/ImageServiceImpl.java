package kg.erkin.FunTime.service.impl;

import kg.erkin.FunTime.dto.entity.Image;
import kg.erkin.FunTime.dto.mapper.ImageMapper;
import kg.erkin.FunTime.dto.model.ImageDto;
import kg.erkin.FunTime.repository.ImageRepository;
import kg.erkin.FunTime.service.ImageService;
import kg.erkin.FunTime.service.base.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl extends AbstractService<Image, ImageDto, ImageRepository, ImageMapper> implements ImageService {
    public ImageServiceImpl(ImageRepository repository, ImageMapper mapper) {
        super(repository, mapper);
    }
}
