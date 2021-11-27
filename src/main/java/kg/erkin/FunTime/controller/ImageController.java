package kg.erkin.FunTime.controller;

import kg.erkin.FunTime.controller.base.AbstractController;
import kg.erkin.FunTime.dto.model.ImageDto;
import kg.erkin.FunTime.service.ImageService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/image")
public class ImageController extends AbstractController<ImageDto, ImageService> {
    public ImageController(ImageService service) {
        super(service);
    }
}
