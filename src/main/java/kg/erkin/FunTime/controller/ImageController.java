package kg.erkin.FunTime.controller;

import kg.erkin.FunTime.dto.model.ImageDto;
import kg.erkin.FunTime.service.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/image")
public class ImageController {
    @Autowired
    BaseCrudService<ImageDto> baseCrudService;

    @GetMapping("/get")
    ResponseEntity<?> getById(@RequestParam Long id){
        return ResponseEntity.ok(baseCrudService.getById(id));
    }

    @PostMapping("/save")
    ResponseEntity<?> save(@RequestBody ImageDto image){
        return ResponseEntity.ok(baseCrudService.save(image));
    }

    @GetMapping("/all")
    ResponseEntity<?> getAll(){
        return ResponseEntity.ok(baseCrudService.getAll());
    }

    @DeleteMapping("/delete")
    void deleteById(@RequestParam Long id){
        baseCrudService.deleteById(id);
    }
}
