package kg.erkin.FunTime.dto.model;

import kg.erkin.FunTime.dto.entity.Image;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@RequiredArgsConstructor
@Builder
public class WithImageDto {
    Long id;

    List<ImageDto> images;
}
