package kg.erkin.FunTime.controller;

import kg.erkin.FunTime.controller.base.AbstractController;
import kg.erkin.FunTime.dto.model.UserDto;
import kg.erkin.FunTime.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends AbstractController<UserDto, UserService> {
    public UserController(UserService service) {
        super(service);
    }
}
