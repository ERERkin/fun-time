package kg.erkin.FunTime.dto.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@SuperBuilder
//@Builder
@Entity
@Table(name = "room_types")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomType extends AbstractEntity {
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
