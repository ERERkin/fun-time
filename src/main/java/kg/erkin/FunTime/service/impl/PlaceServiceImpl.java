package kg.erkin.FunTime.service.impl;

import kg.erkin.FunTime.dto.entity.Place;
import kg.erkin.FunTime.dto.mapper.PlaceMapper;
import kg.erkin.FunTime.dto.model.PlaceDto;
import kg.erkin.FunTime.repository.PlaceRepository;
import kg.erkin.FunTime.service.PlaceService;
import kg.erkin.FunTime.service.base.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class PlaceServiceImpl extends AbstractService<Place, PlaceDto, PlaceRepository, PlaceMapper> implements PlaceService {
    public PlaceServiceImpl(PlaceRepository repository, PlaceMapper mapper) {
        super(repository, mapper);
    }
}
