package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.Order;
import kg.erkin.FunTime.dto.model.OrderDto;
import kg.erkin.FunTime.dto.model.RoomTypeDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Data
public class OrderMapper implements BaseMapper<Order, OrderDto>{
    private final RoomTypeMapper roomTypeMapper;
    private final UserMapper userMapper;

    @Override
    public Order dtoToEntity(OrderDto dto) {
        return null;
    }

    @Override
    public OrderDto entityToDto(Order entity) {
        return OrderDto.builder()
                .startRoom(entity.getStartRoom())
                .roomType(roomTypeMapper.entityToDto(entity.getRoomType()))
                .user(userMapper.entityToDto(entity.getUser()))
                .build();
    }
}
