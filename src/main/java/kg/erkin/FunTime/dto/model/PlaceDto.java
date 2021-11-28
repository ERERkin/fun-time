package kg.erkin.FunTime.dto.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@RequiredArgsConstructor
@SuperBuilder
public class PlaceDto extends AbstractDto {
    String name;

    String description;

    String address;

    List<RoomTypeDto> roomTypes;

    WithImageDto album;
}
