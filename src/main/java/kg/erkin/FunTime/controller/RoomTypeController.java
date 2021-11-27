package kg.erkin.FunTime.controller;

import kg.erkin.FunTime.controller.base.AbstractController;
import kg.erkin.FunTime.dto.model.RoomTypeDto;
import kg.erkin.FunTime.service.RoomTypeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roomType")
public class RoomTypeController extends AbstractController<RoomTypeDto, RoomTypeService> {
    public RoomTypeController(RoomTypeService service) {
        super(service);
    }
}
