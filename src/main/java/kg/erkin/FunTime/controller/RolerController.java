package kg.erkin.FunTime.controller;

import kg.erkin.FunTime.controller.base.AbstractController;
import kg.erkin.FunTime.dto.model.RoleDto;
import kg.erkin.FunTime.service.RoleService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RolerController extends AbstractController<RoleDto, RoleService> {
    public RolerController(RoleService service) {
        super(service);
    }
}
