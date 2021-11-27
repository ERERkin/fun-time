package kg.erkin.FunTime.service.impl;

import kg.erkin.FunTime.dto.entity.Rate;
import kg.erkin.FunTime.dto.mapper.RateMapper;
import kg.erkin.FunTime.dto.model.RateDto;
import kg.erkin.FunTime.repository.RateRepository;
import kg.erkin.FunTime.service.RateService;
import kg.erkin.FunTime.service.base.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class RateServiceImpl extends AbstractService<Rate, RateDto, RateRepository, RateMapper> implements RateService {
    public RateServiceImpl(RateRepository repository, RateMapper mapper) {
        super(repository, mapper);
    }
}
