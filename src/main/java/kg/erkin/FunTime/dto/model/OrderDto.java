package kg.erkin.FunTime.dto.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@RequiredArgsConstructor
@SuperBuilder
public class OrderDto extends AbstractDto {
    LocalDateTime startRoom;

    RoomTypeDto roomType;

    UserDto user;
}
