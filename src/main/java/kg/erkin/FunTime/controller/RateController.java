package kg.erkin.FunTime.controller;

import kg.erkin.FunTime.controller.base.AbstractController;
import kg.erkin.FunTime.dto.model.PlaceDto;
import kg.erkin.FunTime.dto.model.RateDto;
import kg.erkin.FunTime.service.RateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/rate")
public class RateController extends AbstractController<RateDto, RateService> {
    public RateController(RateService service) {
        super(service);
    }
}
