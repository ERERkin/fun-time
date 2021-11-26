package kg.erkin.FunTime.dto.model;

import kg.erkin.FunTime.dto.entity.Place;
import kg.erkin.FunTime.dto.entity.WithImage;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomTypeDto {
    Long id;

    String name;

    String description;

    Long placeId;

    List<ImageDto> album;
}
