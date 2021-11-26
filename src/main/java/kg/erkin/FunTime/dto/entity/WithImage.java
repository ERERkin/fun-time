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
@Table(name = "with_image")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WithImage extends BaseEntity{
    @OneToMany(mappedBy = "album", fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    List<Image> images;
}
