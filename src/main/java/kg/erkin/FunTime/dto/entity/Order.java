package kg.erkin.FunTime.dto.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDateTime;

@SuperBuilder
//@Builder
@Entity
@Table(name = "order")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Order extends AbstractEntity {
    @Column(columnDefinition = "start_room")
    LocalDateTime startRoom;

    @JoinColumn(name = "room_type_id")
    @ManyToOne(targetEntity = RoomType.class)
    RoomType roomType;

    @JoinColumn(name = "user_id")
    @ManyToOne(targetEntity = User.class)
    User user;
}
