package kg.erkin.FunTime.dto.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDateTime;

@SuperBuilder
//@Builder
@Entity
@Table(name = "orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Order extends AbstractEntity {
    @Column(name = "start_room")
    LocalDateTime startRoom;

    @JoinColumn(name = "rate_id")
    @ManyToOne(targetEntity = Rate.class)
    Rate rate;

    @JoinColumn(name = "user_id")
    @ManyToOne(targetEntity = User.class)
    User user;
}
