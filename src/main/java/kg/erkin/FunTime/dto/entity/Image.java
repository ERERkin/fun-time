package kg.erkin.FunTime.dto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@SuperBuilder
//@Builder
@Entity
@Table(name = "images")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Image extends AbstractEntity {
    @Column
    String link;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "album_id")
    WithImage album;
}
