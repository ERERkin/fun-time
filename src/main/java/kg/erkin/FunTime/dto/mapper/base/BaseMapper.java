package kg.erkin.FunTime.dto.mapper.base;

import kg.erkin.FunTime.dto.entity.AbstractEntity;
import kg.erkin.FunTime.dto.model.AbstractDto;

import java.util.List;

public interface BaseMapper<E extends AbstractEntity, D extends AbstractDto> {
    E toEntity(D dto);

    D toDto(E entity);

    List<E> toEntities(List<D> dList);

    List<D> toDtos(List<E> eList);
}
