package kg.erkin.FunTime.service.base;

import kg.erkin.FunTime.dto.entity.AbstractEntity;
import kg.erkin.FunTime.dto.mapper.base.BaseMapper;
import kg.erkin.FunTime.dto.model.AbstractDto;
import kg.erkin.FunTime.repository.BaseRepository;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AbstractService <
        E extends AbstractEntity,
        D extends AbstractDto,
        R extends BaseRepository<E>,
        M extends BaseMapper<E, D>>
        implements BaseService<D> {
    protected final R repository;
    protected final M mapper;

    public AbstractService(R repository, M mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public D getById(Long id) {
        E entity = repository.findById(id).get();
        return mapper.toDto(entity);
    }

    @Override
    public D save(D item) {
        E entity = mapper.toEntity(item);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public List<D> getAll() {
        List<E> eList = repository.findAll().stream().map(x -> (E) x).collect(Collectors.toList());
        return mapper.toDtos(eList);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
