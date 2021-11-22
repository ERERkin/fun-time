package kg.erkin.FunTime.dto.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.math.BigDecimal;

@Builder
@Entity
@Table(name = "room_types")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomType extends BaseEntity {
    @Column
    String name;

    @Column
    String description;

    @JoinColumn(name = "place_id")
    @ManyToOne(targetEntity = Place.class)
    Place place;

    @OneToOne
    @JoinColumn(name = "album_id")
    WithImage album;
}
