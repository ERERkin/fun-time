package kg.erkin.FunTime.dto.model;

import kg.erkin.FunTime.dto.entity.RoomType;
import kg.erkin.FunTime.dto.entity.User;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
@Builder
public class OrderDto {
    LocalDateTime startRoom;

    RoomTypeDto roomType;

    UserDto user;
}
