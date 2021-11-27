package kg.erkin.FunTime.controller.base;

import kg.erkin.FunTime.dto.model.AbstractDto;
import kg.erkin.FunTime.service.base.BaseService;
import org.springframework.http.ResponseEntity;

public class AbstractController<D extends AbstractDto, S extends BaseService<D>>
    implements BaseController<D>{
    protected final S service;

    public AbstractController(S service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<?> getById(Long id) {
        return service.getById(id);
    }

    @Override
    public ResponseEntity<?> save(D dto) {
        return service.save(dto);
    }

    @Override
    public ResponseEntity<?> getAll() {
        return service.getAll();
    }

    @Override
    public void deleteById(Long id) {
        service.deleteById(id);
    }
}
