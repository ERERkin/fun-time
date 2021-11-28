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
public class RoomTypeDto extends AbstractDto {
    String name;

    String description;

    PlaceDto place;

    WithImageDto album;
}
