package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.utils.CycleAvoidingMappingContext;
import org.mapstruct.Context;
import org.mapstruct.InheritInverseConfiguration;

import javax.persistence.MappedSuperclass;
import java.util.List;

@MappedSuperclass
public interface BaseMapper<E, D> {
    E toEntity(D dto, @Context CycleAvoidingMappingContext context);

    @InheritInverseConfiguration
    D toDto(E entity, @Context CycleAvoidingMappingContext context);

    List<E> toEntities(List<D> dList, @Context CycleAvoidingMappingContext context);

    @InheritInverseConfiguration
    List<D> toDtos(List<E> eList, @Context CycleAvoidingMappingContext context);
}
