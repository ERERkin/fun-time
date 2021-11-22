package kg.erkin.FunTime.dto.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Builder
@Entity
@Table(name = "images")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Image extends BaseEntity {
    @Column
    String link;

    @ManyToOne
    @JoinColumn(name = "album_id")
    WithImage album;
}
