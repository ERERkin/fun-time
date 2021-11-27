package kg.erkin.FunTime.controller;

import kg.erkin.FunTime.controller.base.AbstractController;
import kg.erkin.FunTime.dto.model.ImageDto;
import kg.erkin.FunTime.dto.model.PlaceDto;
import kg.erkin.FunTime.service.PlaceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/place")
public class PlaceController extends AbstractController<PlaceDto, PlaceService> {
    public PlaceController(PlaceService service) {
        super(service);
    }
}
