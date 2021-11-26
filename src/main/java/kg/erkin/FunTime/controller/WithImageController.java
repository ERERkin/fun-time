package kg.erkin.FunTime.controller;

import kg.erkin.FunTime.dto.model.PlaceDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

public class WithImageController {
    @GetMapping("/get")
    ResponseEntity<?> getById(@RequestParam Long id){
        return ResponseEntity.ok(null);
    }

    @PostMapping("/save")
    ResponseEntity<?> save(@RequestBody PlaceDto placeDto){
        return ResponseEntity.ok(placeDto);
    }

    @GetMapping("/all")
    ResponseEntity<?> getAll(){
        return ResponseEntity.ok(new ArrayList<>());
    }

    @DeleteMapping("/delete")
    void deleteById(@RequestParam Long id){

    }
}
