package kg.erkin.FunTime.dto.model;

import kg.erkin.FunTime.dto.entity.RoomType;
import kg.erkin.FunTime.dto.entity.WithImage;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlaceDto {
    Long id;

    String name;

    String description;

    String address;

    List<RoomTypeDto> roomTypes;

    List<ImageDto> album;
}
