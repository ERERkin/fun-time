package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.Order;
import kg.erkin.FunTime.dto.mapper.base.AbstractMapper;
import kg.erkin.FunTime.dto.mapper.base.BaseMapper;
import kg.erkin.FunTime.dto.model.OrderDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper extends AbstractMapper<Order, OrderDto> {
    public OrderMapper(ModelMapper mapper) {
        super(mapper, Order.class, OrderDto.class);
    }
}
