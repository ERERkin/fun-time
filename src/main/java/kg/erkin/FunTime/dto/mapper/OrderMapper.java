package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.Order;
import kg.erkin.FunTime.dto.model.OrderDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface OrderMapper extends BaseMapper<Order, OrderDto>{
}
