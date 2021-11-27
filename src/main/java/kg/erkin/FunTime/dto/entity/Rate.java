package kg.erkin.FunTime.dto.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;

@SuperBuilder
//@Builder
@Entity
@Table(name = "prices")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Rate extends AbstractEntity {
    @Column
    Long minute;

    @Column
    BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "room_type_id")
    RoomType roomType;
}
