package kg.erkin.FunTime.service.base;

import kg.erkin.FunTime.dto.model.AbstractDto;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface BaseService<D extends AbstractDto> {
    Map<String, Object> getById(Long id);

    Map<String, Object> save(D item);

    Map<String, Object> getAll();

    void deleteById(Long id);
}
