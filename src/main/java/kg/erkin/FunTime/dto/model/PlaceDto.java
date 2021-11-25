package kg.erkin.FunTime.dto.model;

import kg.erkin.FunTime.dto.entity.RoomType;
import kg.erkin.FunTime.dto.entity.WithImage;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Data
@RequiredArgsConstructor
@Builder
public class PlaceDto {
    Long id;

    String name;

    String description;

    String address;

    List<RoomTypeDto> roomTypes;

    List<ImageDto> album;
}
