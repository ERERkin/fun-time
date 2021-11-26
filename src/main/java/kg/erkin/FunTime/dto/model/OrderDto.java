package kg.erkin.FunTime.dto.model;

import kg.erkin.FunTime.dto.entity.RoomType;
import kg.erkin.FunTime.dto.entity.User;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDto {
    Long id;

    LocalDateTime startRoom;

    RoomTypeDto roomType;

    UserDto user;
}
