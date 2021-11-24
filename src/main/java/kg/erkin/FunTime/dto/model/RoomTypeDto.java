package kg.erkin.FunTime.dto.model;

import kg.erkin.FunTime.dto.entity.Place;
import kg.erkin.FunTime.dto.entity.WithImage;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.List;

@Data
@RequiredArgsConstructor
@Builder
public class RoomTypeDto {
    String name;

    String description;

    PlaceDto place;

    List<ImageDto> album;
}