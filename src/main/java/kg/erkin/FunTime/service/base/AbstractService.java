package kg.erkin.FunTime.service.base;

import kg.erkin.FunTime.dto.entity.AbstractEntity;
import kg.erkin.FunTime.dto.mapper.BaseMapper;
import kg.erkin.FunTime.dto.model.AbstractDto;
import kg.erkin.FunTime.repository.BaseRepository;
import kg.erkin.FunTime.utils.CycleAvoidingMappingContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.stream.Collectors;

public class AbstractService <
        E extends AbstractEntity,
        D extends AbstractDto,
        R extends BaseRepository<E>,
        M extends BaseMapper<E, D>>
        implements BaseService<D> {
    protected final R repository;
    protected final M mapper;
    @Autowired
    protected CycleAvoidingMappingContext context;

    public AbstractService(R repository, M mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public ResponseEntity<?> getById(Long id) {
        E entity = (E) repository.findById(id).get();
        D dto = mapper.toDto(entity, context);
        return ResponseEntity.ok(dto);
    }

    @Override
    public ResponseEntity<?> save(D item) {
        E entity = mapper.toEntity(item, context);
        D dto = mapper.toDto(repository.save(entity), context);
        return ResponseEntity.ok(dto);
    }

    @Override
    public ResponseEntity<?> getAll() {
        List<E> eList = repository.findAll().stream().map(x -> (E) x).collect(Collectors.toList());
        List<D> dList = mapper.toDtos(eList, context);
        return ResponseEntity.ok(dList);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
