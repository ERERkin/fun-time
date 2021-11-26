package kg.erkin.FunTime.dto.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

//@Component
public interface BaseMapper<E, D> {
    ModelMapper mapper = new ModelMapper();

    E dtoToEntity(D dto);

    D entityToDto(E entity);

    String getName();
}
