package kg.erkin.FunTime.dto.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@SuperBuilder
//@Builder
@Entity
@Table(name = "places")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Place extends BaseEntity{
    @Column
    String name;

    @Column
    String description;

    @Column
    String address;

    @OneToMany(mappedBy = "place", fetch = FetchType.EAGER, targetEntity = RoomType.class)
    @Fetch(value = FetchMode.SUBSELECT)
    List<RoomType> roomTypes;

    @OneToOne
    @JoinColumn(name = "album_id")
    WithImage album;
}
