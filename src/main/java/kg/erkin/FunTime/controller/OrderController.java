package kg.erkin.FunTime.controller;

import kg.erkin.FunTime.controller.base.AbstractController;
import kg.erkin.FunTime.dto.model.ImageDto;
import kg.erkin.FunTime.dto.model.OrderDto;
import kg.erkin.FunTime.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/order")
public class OrderController extends AbstractController<OrderDto, OrderService> {
    public OrderController(OrderService service) {
        super(service);
    }
}
