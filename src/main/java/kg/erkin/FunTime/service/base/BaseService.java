package kg.erkin.FunTime.service.base;

import kg.erkin.FunTime.dto.model.AbstractDto;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface BaseService<D extends AbstractDto> {
    D getById(Long id);

    D save(D item);

    List<D> getAll();

    void deleteById(Long id);
}
