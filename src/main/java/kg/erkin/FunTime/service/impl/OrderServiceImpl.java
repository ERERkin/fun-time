package kg.erkin.FunTime.service.impl;

import kg.erkin.FunTime.dto.entity.Order;
import kg.erkin.FunTime.dto.mapper.OrderMapper;
import kg.erkin.FunTime.dto.model.OrderDto;
import kg.erkin.FunTime.repository.OrderRepository;
import kg.erkin.FunTime.service.OrderService;
import kg.erkin.FunTime.service.base.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends AbstractService<Order, OrderDto, OrderRepository, OrderMapper> implements OrderService {
    public OrderServiceImpl(OrderRepository repository, OrderMapper mapper) {
        super(repository, mapper);
    }
}
