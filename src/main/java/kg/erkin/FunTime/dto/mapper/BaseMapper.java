package kg.erkin.FunTime.dto.mapper;

import org.modelmapper.ModelMapper;

public interface BaseMapper<E, D> {
    ModelMapper mapper = new ModelMapper();

    E dtoToEntity(D dto);

    D entityToDto(E entity);
}
