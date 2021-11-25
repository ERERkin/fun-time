package kg.erkin.FunTime.dto.model;

import kg.erkin.FunTime.dto.entity.RoomType;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
@Builder
public class RateDto {
    Long id;

    Long minute;

    BigDecimal amount;

    RoomTypeDto roomType;
}
