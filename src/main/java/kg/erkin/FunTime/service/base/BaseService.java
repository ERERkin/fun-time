package kg.erkin.FunTime.service.base;

import kg.erkin.FunTime.dto.model.AbstractDto;
import org.springframework.http.ResponseEntity;

public interface BaseService<D extends AbstractDto> {
    ResponseEntity<?> getById(Long id);

    ResponseEntity<?> save(D item);

    ResponseEntity<?> getAll();

    void deleteById(Long id);
}
