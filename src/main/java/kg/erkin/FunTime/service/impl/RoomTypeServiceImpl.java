package kg.erkin.FunTime.service.impl;

import kg.erkin.FunTime.dto.entity.RoomType;
import kg.erkin.FunTime.dto.entity.WithImage;
import kg.erkin.FunTime.dto.mapper.RoomTypeMapper;
import kg.erkin.FunTime.dto.model.PlaceDto;
import kg.erkin.FunTime.dto.model.RoomTypeDto;
import kg.erkin.FunTime.dto.model.WithImageDto;
import kg.erkin.FunTime.repository.RoomTypeRepository;
import kg.erkin.FunTime.service.PlaceService;
import kg.erkin.FunTime.service.RoomTypeService;
import kg.erkin.FunTime.service.WithImageService;
import kg.erkin.FunTime.service.base.AbstractService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RoomTypeServiceImpl extends AbstractService<RoomType, RoomTypeDto, RoomTypeRepository, RoomTypeMapper> implements RoomTypeService {
    private final WithImageService withImageService;
    private final PlaceService placeService;

    public RoomTypeServiceImpl(RoomTypeRepository repository, RoomTypeMapper mapper, WithImageService withImageService, PlaceService placeService) {
        super(repository, mapper);
        this.withImageService = withImageService;
        this.placeService = placeService;
    }

    @Override
    public RoomTypeDto save(RoomTypeDto item) {
        System.out.println(item);
        if(item.getId() == null){
            WithImageDto album = withImageService.saveWithImage(WithImage.builder().build());
            item.setAlbum(album);
        }
        return super.save(item);
    }
}
