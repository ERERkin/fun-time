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
    public Map<String, Object> getById(Long id) {
        E entity = repository.findById(id).get();
        D dto = mapper.toDto(entity);
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("body", dto);
        return map;
    }

    @Override
    public Map<String, Object> save(D item) {
        E entity = mapper.toEntity(item);
        D dto = mapper.toDto(repository.save(entity));
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("body", dto);
        return map;
    }

    @Override
    public Map<String, Object> getAll() {
        List<E> eList = repository.findAll().stream().map(x -> (E) x).collect(Collectors.toList());
        List<D> dList = mapper.toDtos(eList);
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("body", dList);
        return map;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
