package kg.erkin.FunTime.service.impl;

import kg.erkin.FunTime.dto.entity.Place;
import kg.erkin.FunTime.dto.entity.WithImage;
import kg.erkin.FunTime.dto.mapper.PlaceMapper;
import kg.erkin.FunTime.dto.model.PlaceDto;
import kg.erkin.FunTime.dto.model.WithImageDto;
import kg.erkin.FunTime.repository.PlaceRepository;
import kg.erkin.FunTime.service.PlaceService;
import kg.erkin.FunTime.service.WithImageService;
import kg.erkin.FunTime.service.base.AbstractService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PlaceServiceImpl extends AbstractService<Place, PlaceDto, PlaceRepository, PlaceMapper> implements PlaceService {
    private final WithImageService withImageService;

    public PlaceServiceImpl(PlaceRepository repository, PlaceMapper mapper, WithImageService withImageService) {
        super(repository, mapper);
        this.withImageService = withImageService;
    }

    @Override
    public PlaceDto save(PlaceDto item) {
        if(item.getId() == null){
            WithImageDto album = withImageService.saveWithImage(WithImage.builder().build());
            item.setAlbum(album);
        }
        return super.save(item);
    }
}
