package kg.erkin.FunTime.service.impl;

import kg.erkin.FunTime.dto.entity.BaseEntity;
import kg.erkin.FunTime.dto.entity.Image;
import kg.erkin.FunTime.dto.mapper.BaseMapper;
import kg.erkin.FunTime.repository.BaseRepository;
import kg.erkin.FunTime.service.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Scope("prototype")
public class BaseCrudServiceImpl<E extends BaseEntity, D> implements BaseCrudService<D> {
    @Autowired
    BaseRepository baseRepository;
    @Autowired
    BaseMapper<E, D> baseMapper;

    @Override
    public D getById(Long id) {
        E entity = (E) baseRepository.findById(id).get();
        return baseMapper.entityToDto(entity);
    }

    @Override
    public D save(D item) {
        E entity = baseMapper.dtoToEntity(item);
        return baseMapper.entityToDto(baseRepository.save(entity));
    }

    @Override
    public List<D> getAll() {
        List<BaseEntity> images = baseRepository.findAll();
        return images.stream().map(x -> baseMapper.entityToDto((E) x)).collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {
        baseRepository.deleteById(id);
    }
}
