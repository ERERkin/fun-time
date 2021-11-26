package kg.erkin.FunTime.dto.model;

import kg.erkin.FunTime.dto.entity.Image;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WithImageDto {
    Long id;

    List<ImageDto> images;
}
