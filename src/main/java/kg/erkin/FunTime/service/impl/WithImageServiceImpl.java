package kg.erkin.FunTime.service.impl;

import kg.erkin.FunTime.dto.entity.WithImage;
import kg.erkin.FunTime.dto.mapper.WithImageMapper;
import kg.erkin.FunTime.dto.model.WithImageDto;
import kg.erkin.FunTime.repository.WithImageRepository;
import kg.erkin.FunTime.service.WithImageService;
import kg.erkin.FunTime.service.base.AbstractService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class WithImageServiceImpl extends AbstractService<WithImage, WithImageDto, WithImageRepository, WithImageMapper> implements WithImageService {
    public WithImageServiceImpl(WithImageRepository repository, WithImageMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public WithImageDto saveWithImage(WithImage withImage) {
        WithImage withImageAns = repository.save(withImage);
        withImage.setImages(new ArrayList<>());
        return mapper.toDto(withImageAns);
    }
}
