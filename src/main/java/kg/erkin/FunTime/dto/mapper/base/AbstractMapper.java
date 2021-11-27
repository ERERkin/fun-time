package kg.erkin.FunTime.dto.mapper.base;

import kg.erkin.FunTime.dto.entity.AbstractEntity;
import kg.erkin.FunTime.dto.model.AbstractDto;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class AbstractMapper<E extends AbstractEntity, D extends AbstractDto> implements BaseMapper<E, D> {
    protected final ModelMapper mapper;
    protected final Class<E> typeEntity;
    protected final Class<D> typeDto;

    public AbstractMapper(ModelMapper mapper, Class<E> typeEntity, Class<D> typeDto) {
        this.mapper = mapper;
        this.typeEntity = typeEntity;
        this.typeDto = typeDto;
    }

    @Override
    public E toEntity(D dto) {
        return dto == null ? null : mapper.map(dto, typeEntity);
    }

    @Override
    public D toDto(E entity) {
        return entity == null ? null : mapper.map(entity, typeDto);
    }

    @Override
    public List<E> toEntities(List<D> dList) {
        return dList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<D> toDtos(List<E> eList) {
        return eList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
