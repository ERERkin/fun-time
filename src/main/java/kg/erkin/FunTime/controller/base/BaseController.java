package kg.erkin.FunTime.controller.base;

import kg.erkin.FunTime.dto.model.AbstractDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface BaseController <D extends AbstractDto>{
    @GetMapping("/get")
    ResponseEntity<?> getById(@RequestParam Long id);

    @PostMapping("/save")
    ResponseEntity<?> save(@RequestBody D dto);

    @GetMapping("/all")
    ResponseEntity<?> getAll();

    @DeleteMapping("/delete")
    void deleteById(@RequestParam Long id);
}
