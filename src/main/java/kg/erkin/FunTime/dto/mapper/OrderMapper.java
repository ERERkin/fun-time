package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.Order;
import kg.erkin.FunTime.dto.mapper.base.AbstractMapper;
import kg.erkin.FunTime.dto.mapper.base.BaseMapper;
import kg.erkin.FunTime.dto.model.OrderDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class OrderMapper extends AbstractMapper<Order, OrderDto> {
    public OrderMapper(ModelMapper mapper) {
        super(mapper, Order.class, OrderDto.class);
    }

    @Override
    public OrderDto toDto(Order entity) {
        if (entity == null) return null;
        if (entity.getRate() != null && entity.getRate().getRoomType() != null && entity.getRate().getRoomType().getPlace() != null){
            entity.getRate().getRoomType().getPlace().setAlbum(null);
            entity.getRate().getRoomType().getPlace().setRoomTypes(null);
        }
        if (entity.getUser().getAvatar() != null && entity.getUser().getAvatar().getImages() != null)
            entity.getUser().getAvatar().getImages().stream().peek(x -> x.setAlbum(null)).collect(Collectors.toList());
        return super.toDto(entity);
    }
}
