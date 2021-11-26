package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.Order;
import kg.erkin.FunTime.dto.model.OrderDto;
import kg.erkin.FunTime.dto.model.RoomTypeDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.swing.text.html.parser.Entity;

@Component
@AllArgsConstructor
@Data
public class OrderMapper implements BaseMapper<Order, OrderDto>{
    @Override
    public Order dtoToEntity(OrderDto dto) {
        return mapper.map(dto, Order.class);
    }

    @Override
    public OrderDto entityToDto(Order entity) {
        return mapper.map(entity, OrderDto.class);
    }

    @Override
    public String getName() {
        return "Order";
    }
}
