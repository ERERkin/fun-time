package kg.erkin.FunTime.dto.model;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Data
@RequiredArgsConstructor
@SuperBuilder
@MappedSuperclass
public abstract class AbstractDto implements Serializable {
    Long id;
}
