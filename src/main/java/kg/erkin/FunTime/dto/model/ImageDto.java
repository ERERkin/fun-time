package kg.erkin.FunTime.dto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kg.erkin.FunTime.dto.entity.WithImage;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@RequiredArgsConstructor
@SuperBuilder
public class ImageDto extends AbstractDto {
    String link;

    WithImageDto album;
}
