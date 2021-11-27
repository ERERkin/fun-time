package kg.erkin.FunTime.controller;

import kg.erkin.FunTime.controller.base.AbstractController;
import kg.erkin.FunTime.dto.model.WithImageDto;
import kg.erkin.FunTime.service.WithImageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/withImage")
public class WithImageController extends AbstractController<WithImageDto, WithImageService> {
    public WithImageController(WithImageService service) {
        super(service);
    }
}
